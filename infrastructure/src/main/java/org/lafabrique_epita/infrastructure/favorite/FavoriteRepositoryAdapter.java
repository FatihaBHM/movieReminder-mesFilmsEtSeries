package org.lafabrique_epita.infrastructure.favorite;

import org.lafabrique_epita.domain.repositories.FavoriteRepository;

public class FavoriteRepositoryAdapter implements FavoriteRepository {

    private final FavoriteJPARepository favoriteJPARepository;

    public FavoriteRepositoryAdapter(FavoriteJPARepository favoriteJPARepository) {
        this.favoriteJPARepository = favoriteJPARepository;
    }
}
