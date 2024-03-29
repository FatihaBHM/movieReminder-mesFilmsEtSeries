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
public class PlayListTv {

    @EmbeddedId
    private PlayListTvID id;

    @ManyToOne(optional = false)
    @MapsId("tvId")
    @JoinColumn(name = "episode_id")
    private Episode episode;

    @ManyToOne(optional = false)
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User user;

    private int Score;

    @Enumerated(EnumType.STRING)
    private StatusEnum status;
}
