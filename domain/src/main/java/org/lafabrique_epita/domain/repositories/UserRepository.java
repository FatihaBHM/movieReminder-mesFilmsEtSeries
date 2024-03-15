package org.lafabrique_epita.domain.repositories;

import org.lafabrique_epita.domain.entities.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findByEmail(String email);
}
