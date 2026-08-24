package TicketFolder.domain.Model;

import TicketFolder.domain.valueObject.UserEmail;
import TicketFolder.domain.valueObject.UserId;
import TicketFolder.domain.valueObject.Username;

public class User {

    private final UserId userId;
    private Username username;
    private UserEmail userEmail;

    public User(UserId userId, Username username, UserEmail userEmail) {
        this.userId = userId;
        this.username = username;
        this.userEmail = userEmail;
    }

    public UserId getUserId() {
        return userId;
    }

    public Username getUsername() {
        return username;
    }

    public UserEmail getUserEmail() {
        return userEmail;
    }
}
