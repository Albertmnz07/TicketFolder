package TicketFolder.domain.repository;

import TicketFolder.domain.Model.User;
import TicketFolder.domain.valueObject.UserEmail;
import TicketFolder.domain.valueObject.UserId;
import TicketFolder.domain.valueObject.Username;

public interface UserRepository {
    User findByUsername(Username username);
    User findById(UserId userId);
    User findByEmail(UserEmail userEmail);
    void save(User user);
}
