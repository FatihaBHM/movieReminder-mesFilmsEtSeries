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
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMovie;

    private String backdropPath;

    @Column(nullable = false)
    private Long idTmdb;

    @Column(nullable = true, columnDefinition = "TEXT")
    private String overview;

    private float score;

    private LocalDate releaseDate;

    private int duration;

    @Column(nullable = false)
    private String title;

    @OneToMany
    @JoinColumn(name = "playlist_movie_id")
    private List<PlayListMovie> playListMovies;

    @OneToMany
    @JoinColumn(name = "favorite_id")
    private List<Favorite> favorites;

    @ManyToMany
    @JoinTable(name = "movie_comments", joinColumns = @JoinColumn(name = "movie_id"), inverseJoinColumns = @JoinColumn(name = "comment_id"))
    private List<Comment> comments;

    @ManyToMany
    @JoinTable(name = "movie_genres", joinColumns = @JoinColumn(name = "movie_id"), inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private List<Genre> genres;

    @ManyToMany
    @JoinTable(name = "movie_languages", joinColumns = @JoinColumn(name = "movie_id"), inverseJoinColumns = @JoinColumn(name = "language_id"))
    private List<Language> languages;

    @ManyToMany
    @JoinTable(name = "movie_countries", joinColumns = @JoinColumn(name = "movie_id"), inverseJoinColumns = @JoinColumn(name = "country_id"))
    private List<Country> countries;
}
