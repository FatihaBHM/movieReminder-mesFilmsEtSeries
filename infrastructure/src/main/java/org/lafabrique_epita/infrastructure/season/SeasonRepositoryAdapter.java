package org.lafabrique_epita.infrastructure.season;

import org.lafabrique_epita.domain.repositories.SeasonRepository;
import org.lafabrique_epita.infrastructure.movie.MovieJPARepository;

public class SeasonRepositoryAdapter implements SeasonRepository {

    private final MovieJPARepository movieJPARepository;

    public SeasonRepositoryAdapter(MovieJPARepository movieJPARepository) {
        this.movieJPARepository = movieJPARepository;
    }
}