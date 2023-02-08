package com.gs.training.dao;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import com.gs.training.model.Datos;

@Repository
public interface DatosRepository extends CrudRepository<Datos, Long> {

}