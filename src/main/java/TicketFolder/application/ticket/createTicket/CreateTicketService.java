package TicketFolder.application.ticket.createTicket;
import TicketFolder.domain.Model.Ticket;
import TicketFolder.domain.error.DomainException;
import TicketFolder.domain.error.ErrorCode;
import TicketFolder.domain.repository.FolderRepository;
import TicketFolder.domain.repository.TicketRepository;
import TicketFolder.domain.repository.UserRepository;
import TicketFolder.domain.valueObject.TicketId;
import org.springframework.stereotype.Service;

@Service
public class CreateTicketService implements CreateTicketUseCase{

    private final TicketRepository ticketRepository;
    private final FolderRepository folderRepository;
    private final UserRepository userRepository;

    public CreateTicketService(TicketRepository ticketRepository, FolderRepository folderRepository, UserRepository userRepository) {
        this.ticketRepository = ticketRepository;
        this.folderRepository = folderRepository;
        this.userRepository = userRepository;
    }


    @Override
    public void execute(CreateTicketCommand command) {
        if (folderRepository.findById(command.folderId()).isEmpty()){
            throw new DomainException(ErrorCode.FOLDER_NOT_FOUND);
        }

        if (userRepository.findById(command.userId()).isEmpty()){
            throw new DomainException(ErrorCode.USER_NOT_FOUND);
        }

        if (ticketRepository.findByFolderIdAndTicketName(command.folderId(), command.ticketName()).isPresent()){
            throw new DomainException(ErrorCode.TICKET_ALREADY_EXISTS);
        }

        Ticket ticket = new Ticket(
                TicketId.generate(),
                command.userId(),
                command.ticketName(),
                command.ticketProduct(),
                command.ticketStore(),
                command.ticketImagePath(),
                command.ticketCode(),
                command.ticketDate()
        );

        ticketRepository.save(ticket);


    }
}
