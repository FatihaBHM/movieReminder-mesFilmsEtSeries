package org.lafabrique_epita.domain.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.lafabrique_epita.domain.valueObjects.CreationVO;
import org.lafabrique_epita.domain.valueObjects.MediaDetailsVO;
import org.springframework.http.HttpStatus;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Season {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "number")
    private int number;

    @Embedded
    private MediaDetailsVO details;

    @OneToMany(mappedBy = "season")
    private List<Episode> episodes;

    @ManyToOne
    private Serie series;

    @OneToMany(mappedBy = "season" )
    private List<SeasonEvaluation> evaluations;

    @Embedded
    private CreationVO CreationDetails;

}
