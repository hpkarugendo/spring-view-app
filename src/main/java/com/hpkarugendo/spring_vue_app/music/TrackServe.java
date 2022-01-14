package com.hpkarugendo.spring_vue_app.music;

import org.springframework.stereotype.Service;

@Service
public class TrackServe {
    private TrackRepo trackR;

    public TrackServe(TrackRepo trackR) {
        this.trackR = trackR;
    }
}
