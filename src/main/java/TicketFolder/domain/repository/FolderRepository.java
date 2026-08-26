package TicketFolder.domain.repository;

import TicketFolder.domain.Model.Folder;
import TicketFolder.domain.valueObject.FolderId;
import TicketFolder.domain.valueObject.FolderName;
import TicketFolder.domain.valueObject.UserId;

import java.util.List;
import java.util.Optional;

public interface FolderRepository {
    List<Folder> findAllByUserId(UserId userId);
    Optional<Folder> findByNameAndUserId(FolderName folderName, UserId userId);
    Optional<Folder> findById(FolderId folderId);
    void delete(Folder folder);
    void save(Folder folder);

}
