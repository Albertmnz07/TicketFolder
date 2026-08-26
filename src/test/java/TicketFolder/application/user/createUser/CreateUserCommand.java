package TicketFolder.application.user.createUser;

import TicketFolder.domain.valueObject.UserEmail;
import TicketFolder.domain.valueObject.Username;

public record CreateUserCommand(
        Username username,
        UserEmail userEmail
) {
}
