package org.lafabrique_epita.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Episode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEpisode;

    private LocalDate airDate;

    private int episodeNumber;

    private String title;

    private String overview;

    private Long idTmdb;

    private int duration;

    private int seasonNumber;

    private String imagePath;

    @OneToMany
    @JoinColumn(name = "playlist_tv_id")
    private List<PlayListTv> playListTvs;

    @ManyToOne(optional = false)
    @JoinColumn(name = "season_id")
    private Season season;

    @ManyToMany
    @JoinTable(name = "episode_comments", joinColumns = @JoinColumn(name = "episode_id"), inverseJoinColumns = @JoinColumn(name = "comment_id"))
    private List<Comment> comments;
}
