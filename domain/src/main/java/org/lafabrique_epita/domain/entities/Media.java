package org.lafabrique_epita.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.lafabrique_epita.domain.enums.AgeCategoryEnum;
import org.lafabrique_epita.domain.valueObjects.CreationVO;
import org.lafabrique_epita.domain.valueObjects.MediaDetailsVO;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Media {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Embedded
    private MediaDetailsVO details;

    @Column(name = "age_category", nullable = true, length = 20)
    @Enumerated(EnumType.STRING)
    private AgeCategoryEnum ageCategoryEnum;

    @ManyToMany(mappedBy = "media")
    private List<Actor> actors;

    @ManyToMany(mappedBy = "media")
    private List<Director> directors;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "media_genre",
            joinColumns = @JoinColumn(name = "media_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private List<Genre> genres ;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "streaming_platform",
            joinColumns = @JoinColumn(name = "media_id"),
            inverseJoinColumns = @JoinColumn(name = "streaming_platform_id"))
    private List<StreamingPlatform> streamingPlatforms ;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns(@JoinColumn(name="country_id",referencedColumnName="id"))
    protected Country country;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns(@JoinColumn(name="original_version_language_id",referencedColumnName="id"))
    protected Language originalVersionLanguage;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "available_audio_languages",
            joinColumns = @JoinColumn(name = "media_id"),
            inverseJoinColumns = @JoinColumn(name = "language_id"))
    private List<Language> availableAudioLanguages ;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "available_subtitles_languages",
            joinColumns = @JoinColumn(name = "media_id"),
            inverseJoinColumns = @JoinColumn(name = "language_id"))
    private List<Language> availableSubtitlesLanguages;

    @ManyToMany(mappedBy = "mediaFavorites")
    private List<User> favoriteForUsers;

    @Embedded
    private CreationVO CreationDetails;


}
