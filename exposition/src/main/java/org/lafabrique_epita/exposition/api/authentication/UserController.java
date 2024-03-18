package org.lafabrique_epita.exposition.api.authentication;

import org.lafabrique_epita.domain.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/save")
    public void save(User user) {
        userService.save(new User());
    }
}
