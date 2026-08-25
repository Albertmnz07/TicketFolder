package TicketFolder.domain.repository;

import TicketFolder.domain.Model.Ticket;
import TicketFolder.domain.valueObject.FolderId;
import TicketFolder.domain.valueObject.TicketId;

import java.util.List;

public interface TicketRepository {
    List<Ticket> findAllByFolderId(FolderId folderId);
    Ticket findById(TicketId ticketId);
}
