package org.lafabrique_epita.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.lafabrique_epita.domain.enums.StatusEnum;
import org.lafabrique_epita.domain.valueObjects.CreationVO;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserEpisodeVisualisation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Movie movie;

    @Column(name = "status",  length = 20)
    @Enumerated(EnumType.STRING)
    private StatusEnum statusEnum;

    @Embedded
    private CreationVO CreationDetails;
}
