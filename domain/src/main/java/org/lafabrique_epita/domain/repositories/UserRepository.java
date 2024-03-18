package org.lafabrique_epita.domain.repositories;

import org.lafabrique_epita.domain.entities.UserEntity;

<<<<<<< HEAD
public interface UserRepository{
=======
import java.util.Optional;

public interface UserRepository {
    Optional<UserEntity> findByEmail(String email);
>>>>>>> 7ba9e2b9c78a01dfea8cf5ebd393d67a493037a7
}
