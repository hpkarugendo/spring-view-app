package com.hpkarugendo.spring_vue_app.music;

import org.springframework.stereotype.Service;

@Service
public class PlaylistServe {
    private PlaylistRepo playlistR;

    public PlaylistServe(PlaylistRepo playlistR) {
        this.playlistR = playlistR;
    }
}
