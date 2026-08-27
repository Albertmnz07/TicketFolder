package TicketFolder.application.ticket.deleteTicket;

import TicketFolder.domain.error.DomainException;
import TicketFolder.domain.error.ErrorCode;
import TicketFolder.domain.repository.TicketRepository;
import org.springframework.stereotype.Service;

@Service
public class DeleteTicketService implements DeleteTicketUseCase{

    private final TicketRepository ticketRepository;

    public DeleteTicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }


    @Override
    public void execute(DeleteTicketCommand command) {
        ticketRepository.delete(
                ticketRepository.findById(command.ticketId())
                        .orElseThrow(() -> new DomainException(ErrorCode.TICKET_NOT_FOUND))
        );

    }
}
