package TicketFolder.domain.repository;

import TicketFolder.domain.Model.Ticket;
import TicketFolder.domain.valueObject.FolderId;
import TicketFolder.domain.valueObject.TicketId;
import TicketFolder.domain.valueObject.TicketName;

import java.util.List;
import java.util.Optional;

public interface TicketRepository {
    List<Ticket> findAllByFolderId(FolderId folderId);
    Optional<Ticket> findById(TicketId ticketId);
    Optional<Ticket> findByFolderIdAndTicketName(FolderId folderId, TicketName ticketName);
    void deleteByFolderId(FolderId folderId);
    void delete(Ticket ticket);
    void save(Ticket ticket);
}
