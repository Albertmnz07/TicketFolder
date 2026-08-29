package TicketFolder.application.ticket.getFolderTickets;

import TicketFolder.domain.Model.Ticket;

import java.util.List;

public record GetFolderTicketsResponse (
        List<Ticket> tickets
) {
}
