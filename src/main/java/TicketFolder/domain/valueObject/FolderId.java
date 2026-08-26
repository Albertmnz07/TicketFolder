package TicketFolder.domain.valueObject;

import java.util.UUID;

public record FolderId(UUID value) {

    public static FolderId generate(){
        return new FolderId(UUID.randomUUID());
    }
}
