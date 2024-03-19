package org.lafabrique_epita.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SeasonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate airDate;

    @Column(nullable = true, columnDefinition = "TEXT")
    private String overview;

    @Column(nullable = false)
    private int idTmdb;

    private String poster_path;

    private int seasonNumber;

    @ManyToOne(optional = false)
    @JoinColumn(name = "serie_id")
    private SerieEntity serie;

    @ManyToMany
    @JoinTable(name = "season_comments", joinColumns = @JoinColumn(name = "season_id"), inverseJoinColumns = @JoinColumn(name = "comment_id"))
    private List<CommentEntity> comments;

    @Embedded
    private CommonEntity common;
}
