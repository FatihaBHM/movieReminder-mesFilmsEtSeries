package org.lafabrique_epita.infrastructure.comment;

import org.lafabrique_epita.domain.repositories.CommentRepository;

public class CommentRepositoryAdapter implements CommentRepository {

    private final CommentJPARepository commentJpaRepository;

    public CommentRepositoryAdapter(CommentJPARepository commentJpaRepository) {
        this.commentJpaRepository = commentJpaRepository;
    }
}