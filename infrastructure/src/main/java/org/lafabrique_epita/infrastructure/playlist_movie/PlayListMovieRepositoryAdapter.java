package org.lafabrique_epita.infrastructure.playlist_movie;

import org.lafabrique_epita.domain.repositories.PlayListMovieRepository;
import org.lafabrique_epita.infrastructure.movie.MovieJPARepository;

public class PlayListMovieRepositoryAdapter implements PlayListMovieRepository {

        private final MovieJPARepository movieJPARepository;

        public PlayListMovieRepositoryAdapter(MovieJPARepository movieJPARepository) {
            this.movieJPARepository = movieJPARepository;
        }
}
