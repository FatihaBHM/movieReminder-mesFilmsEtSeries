package org.lafabrique_epita.domain.repositories;

import org.lafabrique_epita.domain.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository <Movie, Long>{
}
