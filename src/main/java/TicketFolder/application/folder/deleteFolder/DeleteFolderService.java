package TicketFolder.application.folder.deleteFolder;

import TicketFolder.domain.Model.Folder;
import TicketFolder.domain.error.DomainException;
import TicketFolder.domain.error.ErrorCode;
import TicketFolder.domain.repository.FolderRepository;
import TicketFolder.domain.repository.TicketRepository;
import org.springframework.stereotype.Service;

@Service
public class DeleteFolderService implements DeleteFolderUseCase{

    private final FolderRepository folderRepository;
    private final TicketRepository ticketRepository;

    public DeleteFolderService(FolderRepository folderRepository, TicketRepository ticketRepository) {
        this.folderRepository = folderRepository;
        this.ticketRepository = ticketRepository;
    }

    @Override
    public void execute(DeleteFolderCommand command) {
        Folder folder = folderRepository.findById(command.folderId()).orElseThrow(() -> new DomainException(ErrorCode.FOLDER_NOT_FOUND));

        if (folder.isDefault()) throw new DomainException(ErrorCode.DEFAULT_FOLDER_CANNOT_BE_DELETED);

        ticketRepository.deleteByFolderId(command.folderId());
        folderRepository.delete(folder);
    }
}
