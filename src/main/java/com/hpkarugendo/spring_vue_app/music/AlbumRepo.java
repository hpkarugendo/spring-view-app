package com.hpkarugendo.spring_vue_app.music;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlbumRepo extends CrudRepository<Album, Integer> {
    List<Album> findAll();

    @Override
    void deleteById(Integer integer);
}
