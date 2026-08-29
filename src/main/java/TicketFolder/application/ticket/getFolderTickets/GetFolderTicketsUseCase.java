package TicketFolder.application.ticket.getFolderTickets;


public interface GetFolderTicketsUseCase {
    GetFolderTicketsResponse execute(GetFolderTicketsCommand command);
}
