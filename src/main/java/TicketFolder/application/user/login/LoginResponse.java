package TicketFolder.application.user.login;

import TicketFolder.domain.valueObject.UserId;

public record LoginResponse (
        UserId userId
) {
}
