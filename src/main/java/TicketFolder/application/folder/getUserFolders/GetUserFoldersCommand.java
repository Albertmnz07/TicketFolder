package TicketFolder.application.folder.getUserFolders;

import TicketFolder.domain.valueObject.UserId;

public record GetUserFoldersCommand (
        UserId userId
) {
}
