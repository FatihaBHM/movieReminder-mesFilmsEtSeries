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
public class PlayListTvEntity {

    @EmbeddedId
    private PlayListTvID id;

    @ManyToOne(optional = false)
    @MapsId("tvId")
    @JoinColumn(name = "episode_id")
    private EpisodeEntity episode;

    @ManyToOne(optional = false)
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private UserEntity user;

    private int Score;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusEnum status;

    @Embedded
    private CommonEntity commons;
}
