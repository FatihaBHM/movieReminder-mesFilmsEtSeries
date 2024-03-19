package org.lafabrique_epita.exposition.dto;

import lombok.RequiredArgsConstructor;
import org.lafabrique_epita.domain.entities.UserEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@RequiredArgsConstructor
public class RegisterDtoMapper {

    public static UserEntity convertToUserEntity(RegisterDto registerDto) {
        UserEntity user = new UserEntity();
        user.setPassword(registerDto.password());
        user.setEmail(registerDto.email());
        user.setPseudo(registerDto.username());
        return user;
    }
}
