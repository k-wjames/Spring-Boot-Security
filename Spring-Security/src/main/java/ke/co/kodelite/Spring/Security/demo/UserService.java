package ke.co.kodelite.Spring.Security.demo;

import ke.co.kodelite.Spring.Security.entity.User;
import ke.co.kodelite.Spring.Security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers(){
        return userRepository.findAll();
    }
}
