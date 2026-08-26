package TicketFolder.application.folder.getUserFolders;

public interface GetUserFoldersUseCase {
    GetUserFoldersResponse execute(GetUserFoldersCommand command);
}
