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
public class StreamingPlatform {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    protected String name;
    protected String adresseUrl;
    protected String imagePath;

    @ManyToMany(mappedBy = "streamingPlatforms")
    private List<Media> media;

    @Embedded
    private CreationVO CreationDetails;
}
