package TicketFolder.application.user.login;

public interface LoginUseCase {
    LoginResponse execute(LoginCommand command);
}
