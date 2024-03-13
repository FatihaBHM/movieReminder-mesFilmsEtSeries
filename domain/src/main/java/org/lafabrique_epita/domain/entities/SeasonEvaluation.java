package org.lafabrique_epita.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.lafabrique_epita.domain.valueObjects.CreationVO;
import org.lafabrique_epita.domain.valueObjects.EvaluationDetailsVO;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SeasonEvaluation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Embedded
    private EvaluationDetailsVO evaluationDetails;

    @ManyToOne
    private User user;

    @ManyToOne
    private Season season;

    @Embedded
    private CreationVO CreationDetails;

}
