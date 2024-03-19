package org.lafabrique_epita.exposition.api.authentication;

import jakarta.validation.Valid;
import org.lafabrique_epita.application.service.user.UserServiceImpl;
import org.lafabrique_epita.domain.entities.UserEntity;
import org.lafabrique_epita.exposition.dto.RegisterDto;
import org.lafabrique_epita.exposition.dto.RegisterDtoMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<Long> save(@Valid @RequestBody RegisterDto registerDto) {
        UserEntity user = RegisterDtoMapper.convertToUserEntity(registerDto);
        Long id = userService.save(user);
        return ResponseEntity.ok(id);

    }
}
