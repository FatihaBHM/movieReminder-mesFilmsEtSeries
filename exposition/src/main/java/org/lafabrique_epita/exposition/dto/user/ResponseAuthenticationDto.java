package org.lafabrique_epita.exposition.dto.user;

public record ResponseAuthenticationDto(
        String token,
        ResponseAuthenticationUserDto user
) {
}
