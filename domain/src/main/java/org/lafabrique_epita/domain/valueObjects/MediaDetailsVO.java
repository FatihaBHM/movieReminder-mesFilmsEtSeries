package org.lafabrique_epita.domain.valueObjects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class MediaDetailsVO {

    @Column(name = "title")
    private String title;

    @Column(name = "edition_year")
    private int editionYear;

    @Column(name = "image_path")
    private String imagePath;


    @Column(name = "summary", length = 500, columnDefinition = "TEXT")
    private String summary;

    @Column(name = "trailer_video_url")
    private String trailerVideoUrl;

    @Column(name = "bande_annonce_url")
    private String bandeAnnonceUrl;

}
