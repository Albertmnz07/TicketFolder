package TicketFolder.application.folder.getUserFolders;

import TicketFolder.domain.Model.Folder;

import java.util.List;

public record GetUserFoldersResponse(
        List<Folder> folders
) {
}
