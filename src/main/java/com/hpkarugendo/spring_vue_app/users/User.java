package com.hpkarugendo.spring_vue_app.users;

import com.hpkarugendo.spring_vue_app.music.Playlist;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private int id;
    @Column(unique = true)
    private String username;
    private String password, avatar;
    private LocalDate joined;
    @ManyToMany
    @JoinTable(
            name = "user_playlists",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "playlist_id"))
    private List<Playlist> playlists;
}
