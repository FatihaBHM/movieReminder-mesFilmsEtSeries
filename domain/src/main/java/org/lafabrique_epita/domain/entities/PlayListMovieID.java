package org.lafabrique_epita.domain.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import org.lafabrique_epita.domain.enums.StatusEnum;

import java.io.Serializable;

@Embeddable
public class PlayListMovieID implements Serializable {
    private Long movieId;
    private Long userId;

}
