package org.lafabrique_epita.domain.repositories;

import org.lafabrique_epita.domain.entities.PlayListMovie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayListMovieRepository extends JpaRepository<PlayListMovie, Long> {
}
