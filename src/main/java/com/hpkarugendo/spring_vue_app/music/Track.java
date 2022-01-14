package com.hpkarugendo.spring_vue_app.music;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Track {
    @Id
    @GeneratedValue
    private int id;
    private String title;
    private int no, duration;
    @ManyToMany(mappedBy = "tracks")
    private List<Album> albums;
    @ManyToMany(mappedBy = "tracks")
    private List<Artist> artists;
    @ManyToMany(mappedBy = "tracks")
    private List<Playlist> playlists;
}
