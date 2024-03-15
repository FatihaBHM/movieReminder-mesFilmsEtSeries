package org.lafabrique_epita.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.lafabrique_epita.domain.enums.RoleEnum;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "utilisateur")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pseudo;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private RoleEnum role;

    @OneToMany
    @JoinColumn(name = "playlist_tv_id")
    private List<PlayListTv> playListTvs;

    @OneToMany
    @JoinColumn(name="playlist_movie_id")
    private List<PlayListMovie> playListMovies;

    @OneToMany
    @JoinColumn(name = "favorite_id")
    private List<Favorite> favorites;

    @Embedded
    private Commons commons;

}
