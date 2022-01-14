package com.hpkarugendo.spring_vue_app.music;

import com.hpkarugendo.spring_vue_app.users.User;
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
public class Playlist {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @ManyToMany
    @JoinTable(
            name = "playlist_tracks",
            joinColumns = @JoinColumn(name = "playlist_id"),
            inverseJoinColumns = @JoinColumn(name = "track_id"))
    private List<Track> tracks;
    @ManyToMany(mappedBy = "playlists")
    private List<User> users;
}
