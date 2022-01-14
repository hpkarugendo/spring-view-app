package com.hpkarugendo.spring_vue_app.music;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaylistRepo extends CrudRepository<Playlist, Integer> {
    List<Playlist> findAll();

    @Override
    void deleteById(Integer integer);
}
