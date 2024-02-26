package com.chatapi.application;

import com.chatapi.domain.user.UserRepository;
import com.chatapi.domain.user.User;
import org.springframework.stereotype.Service;

@Service
public class UserManager {

    private UserRepository userRepository;

    public UserManager(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findOrCreateUser(String userName) {
        User existingUser = userRepository.findByName(userName);
        if (existingUser != null) {
            return existingUser;
        } else {
            return userRepository.save(userName);
        }
    }

}
