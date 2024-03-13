package org.lafabrique_epita.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.lafabrique_epita.domain.valueObjects.CreationVO;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Serie extends Media{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany(mappedBy = "series" )
    private List<Season> seasons;

    @OneToMany(mappedBy = "series" )
    private List<SerieEvaluation> evaluations;

    @Embedded
    private CreationVO CreationDetails;
}
