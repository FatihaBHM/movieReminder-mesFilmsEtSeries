package org.lafabrique_epita.exposition.dto;

import org.lafabrique_epita.domain.entities.UserEntity;

public class RegisterDtoMapper {

    public static UserEntity convertToUserEntity(RegisterDto registerDto) {
        UserEntity user = new UserEntity();
        user.setPassword(registerDto.getPassword());
        user.setEmail(registerDto.getEmail());
        user.setPseudo(registerDto.getUsername());
        return user;
    }
}
