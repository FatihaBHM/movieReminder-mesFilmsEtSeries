package org.lafabrique_epita.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.lafabrique_epita.domain.enums.StatusEnum;
import org.lafabrique_epita.domain.valueObjects.CreationVO;
import org.lafabrique_epita.domain.valueObjects.MediaDetailsVO;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Episode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "number")
    private int number;

    @Column(name = "duration")
    private String duration;

    @Embedded
    private MediaDetailsVO details;

    @ManyToOne
    private Season season;

    @OneToMany(mappedBy = "episode" )
    private List<EpisodeEvaluation> evaluations;

    @Column(name = "status",  length = 20)
    @Enumerated(EnumType.STRING)
    private StatusEnum statusEnum;

    @Embedded
    private CreationVO CreationDetails;
}
