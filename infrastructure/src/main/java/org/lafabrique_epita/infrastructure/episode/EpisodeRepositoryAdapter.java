package org.lafabrique_epita.infrastructure.episode;

import org.lafabrique_epita.domain.repositories.EpisodeRepository;

public class EpisodeRepositoryAdapter implements EpisodeRepository {

    private final EpisodeJPARepository episodeJPARepository;

    public EpisodeRepositoryAdapter(EpisodeJPARepository commentJpaRepository) {
        this.episodeJPARepository = commentJpaRepository;
    }
}
