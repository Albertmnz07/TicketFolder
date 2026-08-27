package TicketFolder.application.ticket.deleteTicket;

import TicketFolder.domain.valueObject.TicketId;

public record DeleteTicketCommand(
        TicketId ticketId
) {
}
