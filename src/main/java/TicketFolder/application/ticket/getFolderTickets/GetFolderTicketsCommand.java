package TicketFolder.application.ticket.getFolderTickets;

import TicketFolder.domain.valueObject.FolderId;

public record GetFolderTicketsCommand(
        FolderId folderId
) {
}
