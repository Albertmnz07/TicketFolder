package TicketFolder.domain.Model;

import TicketFolder.domain.valueObject.FolderDescription;
import TicketFolder.domain.valueObject.FolderId;
import TicketFolder.domain.valueObject.FolderName;
import TicketFolder.domain.valueObject.UserId;

public class Folder{
    private final FolderId folderId;
    private final UserId userId;
    private FolderName folderName;
    private FolderDescription folderDescription;

    public Folder(FolderId folderId, UserId userId, FolderName folderName, FolderDescription folderDescription) {
        this.folderId = folderId;
        this.userId = userId;
        this.folderName = folderName;
        this.folderDescription = folderDescription;
    }
}
