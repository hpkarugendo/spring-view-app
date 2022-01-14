package com.hpkarugendo.spring_vue_app.music;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrackRepo extends CrudRepository<Track, Integer> {
    List<Track> findAll();

    @Override
    void deleteById(Integer integer);
}
