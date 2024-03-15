package org.lafabrique_epita.domain.repositories;

import org.lafabrique_epita.domain.entities.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepository extends JpaRepository<Serie, Long> {
}
