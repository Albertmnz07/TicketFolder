package TicketFolder.domain.repository;

import TicketFolder.domain.Model.Ticket;
import TicketFolder.domain.valueObject.FolderId;
import TicketFolder.domain.valueObject.TicketId;

import java.util.List;
import java.util.Optional;

public interface TicketRepository {
    List<Ticket> findAllByFolderId(FolderId folderId);
    Optional<Ticket> findById(TicketId ticketId);
}
