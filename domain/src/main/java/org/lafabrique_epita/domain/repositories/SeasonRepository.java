package org.lafabrique_epita.domain.repositories;

import org.lafabrique_epita.domain.entities.Season;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeasonRepository extends JpaRepository<Season, Long> {
}
