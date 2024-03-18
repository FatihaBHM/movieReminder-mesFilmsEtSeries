package org.lafabrique_epita.infrastructure.serie;

import org.lafabrique_epita.domain.repositories.SerieRepository;
import org.lafabrique_epita.infrastructure.movie.MovieJPARepository;

public class SerieRepositoryAdapter implements SerieRepository {

    private final MovieJPARepository movieJPARepository;

    public SerieRepositoryAdapter(MovieJPARepository movieJPARepository) {
        this.movieJPARepository = movieJPARepository;
    }
}
