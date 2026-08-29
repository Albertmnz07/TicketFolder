package TicketFolder.application.ticket.getFolderTickets;

import TicketFolder.domain.error.DomainException;
import TicketFolder.domain.error.ErrorCode;
import TicketFolder.domain.repository.FolderRepository;
import TicketFolder.domain.repository.TicketRepository;
import org.springframework.stereotype.Service;

@Service
public class GetTicketsFolderService implements GetFolderTicketsUseCase{

    private final FolderRepository folderRepository;
    private final TicketRepository ticketRepository;


    public GetTicketsFolderService(FolderRepository folderRepository, TicketRepository ticketRepository) {
        this.folderRepository = folderRepository;
        this.ticketRepository = ticketRepository;
    }


    @Override
    public GetFolderTicketsResponse execute(GetFolderTicketsCommand command) {
        if (folderRepository.findById(command.folderId()).isEmpty()){
            throw new DomainException(ErrorCode.FOLDER_NOT_FOUND);
        }

        return new GetFolderTicketsResponse(
                ticketRepository.findAllByFolderId(command.folderId())
        );
    }
}
