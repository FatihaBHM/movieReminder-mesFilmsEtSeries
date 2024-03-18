package org.lafabrique_epita.infrastructure.genre;

import org.lafabrique_epita.domain.repositories.GenreRepository;

public class GenreRepositoryAdapter implements GenreRepository {

    private final GenreJPARepository genreJPARepository;

    public GenreRepositoryAdapter(GenreJPARepository genreJPARepository) {
        this.genreJPARepository = genreJPARepository;
    }
}
