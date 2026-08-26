package TicketFolder.application.user.login;

import TicketFolder.domain.Model.User;

public interface LoginUseCase {
    LoginResponse execute(LoginCommand command);
}
