package com.gs.training.dao;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;

import com.gs.training.model.Plantilla;

@Repository
public interface PlantillaRepository extends CrudRepository<Plantilla, Long> {

    List<Plantilla> findAll();
}