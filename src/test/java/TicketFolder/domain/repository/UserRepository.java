package TicketFolder.domain.repository;

import TicketFolder.domain.Model.User;
import TicketFolder.domain.valueObject.UserEmail;
import TicketFolder.domain.valueObject.UserId;
import TicketFolder.domain.valueObject.Username;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findByUsername(Username username);
    Optional<User> findById(UserId userId);
    Optional<User> findByEmail(UserEmail userEmail);
    void save(User user);
}
