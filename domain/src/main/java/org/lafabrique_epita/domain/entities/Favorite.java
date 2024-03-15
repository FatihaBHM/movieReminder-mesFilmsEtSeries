package org.lafabrique_epita.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Favorite {

    @EmbeddedId
    private FavoriteID id;

    @ManyToOne(optional = true)
    @MapsId("movieId")
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @ManyToOne(optional = true)
    @MapsId("serieId")
    @JoinColumn(name = "serie_id")
    private Serie serie;

    @ManyToOne(optional = false)
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User user;

    @Embedded
    private Commons commons;



}
