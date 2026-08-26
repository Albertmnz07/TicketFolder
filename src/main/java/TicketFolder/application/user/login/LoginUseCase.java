package TicketFolder.application.user.login;

import TicketFolder.domain.Model.User;

public interface LoginUseCase {
    User execute(LoginCommand command);
}
