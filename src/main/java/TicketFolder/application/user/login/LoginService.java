package TicketFolder.application.user.login;

import TicketFolder.domain.error.DomainException;
import TicketFolder.domain.error.ErrorCode;
import TicketFolder.domain.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements LoginUseCase {

    private final UserRepository userRepository;


    public LoginService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public LoginResponse execute(LoginCommand command) {
        return new LoginResponse(
                userRepository.
                        findByUsername(command.username()).
                        orElseThrow(() -> new DomainException(ErrorCode.USER_NOT_FOUND)).getUserId());
    }
}
