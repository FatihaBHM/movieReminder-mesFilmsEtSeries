package org.lafabrique_epita.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.lafabrique_epita.domain.valueObjects.CreationVO;
import org.lafabrique_epita.domain.valueObjects.EvaluationDetailsVO;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SerieEvaluation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private EvaluationDetailsVO evaluationDetails;
    @ManyToOne
    private User user;
    @ManyToOne
    private Serie series;

    @Embedded
    private CreationVO CreationDetails;
}
