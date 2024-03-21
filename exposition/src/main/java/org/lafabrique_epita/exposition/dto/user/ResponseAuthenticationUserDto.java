package org.lafabrique_epita.exposition.dto.user;

public record ResponseAuthenticationUserDto(
        String username,
        String email
) {
}
