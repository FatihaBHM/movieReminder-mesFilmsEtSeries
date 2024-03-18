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
public class Serie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate firstAirDate;

    @Column(nullable = false)
    private Long idTmdb;

    @Column(nullable = true, columnDefinition = "TEXT")
    private String overview;

    private String posterPath;

   // @Column(nullable = true)
    //private String image_landscape;

    //@Column(nullable = true)
   // private String image_portrait;

    private LocalDate lastAirDate;

    @Column(nullable = false)
    private String title;

    private int numberOfEpisodes;

    private int numberOfSeasons;

    private float score;

    @OneToMany
    @JoinColumn(name = "favorite_id")
    private List<Favorite> favorites;

    @ManyToMany
    @JoinTable(name = "serie_comments", joinColumns = @JoinColumn(name = "serie_id"), inverseJoinColumns = @JoinColumn(name = "comment_id"))
    private List<Comment> comments;

    @ManyToMany
    @JoinTable(name = "serie_genres", joinColumns = @JoinColumn(name = "serie_id"), inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private List<Genre> genres;

    @ManyToMany
    @JoinTable(name = "serie_languages", joinColumns = @JoinColumn(name = "serie_id"), inverseJoinColumns = @JoinColumn(name = "language_id"))
    private List<Language> languages;

    @ManyToMany
    @JoinTable(name = "serie_countries", joinColumns = @JoinColumn(name = "serie_id"), inverseJoinColumns = @JoinColumn(name = "country_id"))
    private List<Country> countries;

    @Embedded
    private Commons commons;
}
