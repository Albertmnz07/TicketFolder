package TicketFolder.application.ticket.createTicket;

import TicketFolder.domain.valueObject.*;

public record CreateTicketCommand (
        TicketName ticketName,
        TicketImagePath ticketImagePath,
        TicketStore ticketStore,
        TicketProduct ticketProduct,
        TicketDate ticketDate,
        TicketCode ticketCode,
        FolderId folderId,
        UserId userId
) {
}
