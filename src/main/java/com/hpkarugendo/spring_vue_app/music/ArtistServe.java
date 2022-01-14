package com.hpkarugendo.spring_vue_app.music;

import org.springframework.stereotype.Service;

@Service
public class ArtistServe {
    private ArtistRepo artistR;

    public ArtistServe(ArtistRepo artistR) {
        this.artistR = artistR;
    }
}
