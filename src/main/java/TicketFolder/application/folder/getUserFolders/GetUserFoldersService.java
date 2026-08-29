package TicketFolder.application.folder.getUserFolders;

import TicketFolder.domain.error.DomainException;
import TicketFolder.domain.error.ErrorCode;
import TicketFolder.domain.repository.FolderRepository;
import TicketFolder.domain.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class GetUserFoldersService implements GetUserFoldersUseCase{

    private final FolderRepository folderRepository;
    private final UserRepository userRepository;


    public GetUserFoldersService(FolderRepository folderRepository, UserRepository userRepository) {
        this.folderRepository = folderRepository;
        this.userRepository = userRepository;
    }


    @Override
    public GetUserFoldersResponse execute(GetUserFoldersCommand command) {
        if (userRepository.findById(command.userId()).isEmpty()){
            throw new DomainException(ErrorCode.USER_NOT_FOUND);
        }

        return new GetUserFoldersResponse(folderRepository.findAllByUserId(command.userId()));
    }
}
