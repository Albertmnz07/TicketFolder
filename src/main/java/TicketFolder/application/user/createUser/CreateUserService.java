package TicketFolder.application.user.createUser;

import TicketFolder.domain.Model.Folder;
import TicketFolder.domain.Model.User;
import TicketFolder.domain.error.DomainException;
import TicketFolder.domain.error.ErrorCode;
import TicketFolder.domain.repository.FolderRepository;
import TicketFolder.domain.repository.UserRepository;
import TicketFolder.domain.valueObject.UserId;

import org.springframework.stereotype.Service;

@Service
public class CreateUserService implements CreateUserUseCase{

    private final UserRepository userRepository;
    private final FolderRepository folderRepository;

    public CreateUserService(UserRepository userRepository, FolderRepository folderRepository) {
        this.userRepository = userRepository;
        this.folderRepository = folderRepository;
    }


    @Override
    public void execute(CreateUserCommand command) {

        if (userRepository.findByUsername(command.username()).isPresent()){
            throw new DomainException(ErrorCode.UNAVAILABLE_USERNAME);
        }

        User user = new User(UserId.generate(), command.username(), command.userEmail());
        userRepository.save(user);

        folderRepository.save(Folder.makeDefaultFolder(user.getUserId()));
    }
}
