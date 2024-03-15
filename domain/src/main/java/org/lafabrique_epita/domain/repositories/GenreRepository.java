package org.lafabrique_epita.domain.repositories;

import org.lafabrique_epita.domain.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
