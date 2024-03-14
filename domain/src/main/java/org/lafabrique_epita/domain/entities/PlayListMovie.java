package org.lafabrique_epita.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.lafabrique_epita.domain.enums.StatusEnum;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PlayListMovie {

    @EmbeddedId
    private PlayListMovieID id;

    @ManyToOne(optional = false)
    @MapsId("movieId")
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @ManyToOne(optional = false)
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User user;

    private float score;

    @Enumerated(EnumType.STRING)
    private StatusEnum status;
}
