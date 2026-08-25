package TicketFolder.domain.repository;

import TicketFolder.domain.Model.Folder;
import TicketFolder.domain.valueObject.FolderId;
import TicketFolder.domain.valueObject.UserId;

import java.util.List;

public interface FolderRepository {
    List<Folder> findAllByUserId(UserId userId);
    Folder findById(FolderId folderId);
    void save(Folder folder);

}
