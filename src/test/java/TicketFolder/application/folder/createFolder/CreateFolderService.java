package TicketFolder.application.folder.createFolder;

import TicketFolder.domain.Model.Folder;
import TicketFolder.domain.error.DomainException;
import TicketFolder.domain.error.ErrorCode;
import TicketFolder.domain.repository.FolderRepository;
import TicketFolder.domain.repository.UserRepository;
import TicketFolder.domain.valueObject.FolderId;
import org.springframework.stereotype.Service;

@Service
public class CreateFolderService implements CreateFolderUseCase{

    private final UserRepository userRepository;
    private final FolderRepository folderRepository;

    public CreateFolderService(UserRepository userRepository, FolderRepository folderRepository) {
        this.userRepository = userRepository;
        this.folderRepository = folderRepository;
    }


    @Override
    public void execute(CreateFolderCommand command) {
        if (userRepository.findById(command.userId()).isEmpty()){
            throw new DomainException(ErrorCode.USER_NOT_FOUND);
        }

        if (folderRepository.findByNameAndUserId(command.folderName(), command.userId()).isPresent()){
            throw new DomainException(ErrorCode.FOLDER_ALREADY_EXISTS);
        }

        Folder folder = new Folder(FolderId.generate(), command.userId(), command.folderName(), command.folderDescription());
        folderRepository.save(folder);
    }
}
