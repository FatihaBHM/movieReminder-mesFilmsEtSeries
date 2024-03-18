package org.lafabrique_epita.infrastructure.movie;

import org.lafabrique_epita.domain.repositories.MovieRepository;

public class MovieRepositoryAdapter implements MovieRepository {

        private final MovieJPARepository movieJPARepository;

        public MovieRepositoryAdapter(MovieJPARepository movieJPARepository) {
            this.movieJPARepository = movieJPARepository;
        }
}
