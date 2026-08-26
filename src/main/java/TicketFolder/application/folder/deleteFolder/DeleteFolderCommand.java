package TicketFolder.application.folder.deleteFolder;

import TicketFolder.domain.valueObject.FolderId;

public record DeleteFolderCommand (
        FolderId folderId
){
}
