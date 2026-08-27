package TicketFolder.domain.valueObject;

import java.util.UUID;

public record TicketId(UUID value) {

    public static TicketId generate(){
        return new TicketId(UUID.randomUUID());
    }
}
