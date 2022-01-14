package com.hpkarugendo.spring_vue_app.music;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Artist {
    @Id
    @GeneratedValue
    private int id;
    private String firstName, lastName;
    @ManyToMany
    @JoinTable(
            name = "artist_tracks",
            joinColumns = @JoinColumn(name = "artist_id"),
            inverseJoinColumns = @JoinColumn(name = "track_id"))
    private List<Track> tracks;
    @ManyToMany
    @JoinTable(
            name = "artist_albums",
            joinColumns = @JoinColumn(name = "artist_id"),
            inverseJoinColumns = @JoinColumn(name = "album_id"))
    private List<Album> albums;
}
