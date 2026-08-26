package TicketFolder.application.user.login;

import TicketFolder.domain.valueObject.Username;

public record LoginCommand (
        Username username
        //open to future token authentication
) {
}
