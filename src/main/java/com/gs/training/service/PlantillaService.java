package com.gs.training.service;

import jakarta.inject.Singleton;

import java.util.List;

import com.gs.training.dao.*;
import com.gs.training.entity.*;

@Singleton
public class PlantillaService {

    private PlantillaRepository plantillaRepository;
    private DatosRepository datosRepository;

    public PlantillaService(PlantillaRepository plantillaRepository,
        DatosRepository datosRepository) {
            this.plantillaRepository = plantillaRepository;
            this.datosRepository = datosRepository;
    }

    public List<Plantilla> findAll() {
        return plantillaRepository.findAll();
    }

    public Plantilla findById(Long id) {
        return plantillaRepository.findById(id).get();
    }
}