package com.hpkarugendo.spring_vue_app.music;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtistRepo extends CrudRepository<Artist, Integer> {
    List<Artist> findAll();

    @Override
    void deleteById(Integer integer);
}
