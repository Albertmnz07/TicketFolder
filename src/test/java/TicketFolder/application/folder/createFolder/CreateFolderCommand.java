package TicketFolder.application.folder.createFolder;

import TicketFolder.domain.valueObject.FolderDescription;
import TicketFolder.domain.valueObject.FolderName;
import TicketFolder.domain.valueObject.UserId;

public record CreateFolderCommand (
        UserId userId,
        FolderName folderName,
        FolderDescription folderDescription
) {
}
