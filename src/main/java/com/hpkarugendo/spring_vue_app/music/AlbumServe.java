package com.hpkarugendo.spring_vue_app.music;

import org.springframework.stereotype.Service;

@Service
public class AlbumServe {
    private AlbumRepo albumR;

    public AlbumServe(AlbumRepo albumR) {
        this.albumR = albumR;
    }
}
