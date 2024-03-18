package org.lafabrique_epita.application.service;

import org.lafabrique_epita.domain.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void save(String username, String password) {

    }
}
