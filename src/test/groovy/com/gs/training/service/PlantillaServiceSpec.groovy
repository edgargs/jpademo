package com.gs.training.service

import spock.lang.Specification

import com.gs.training.model.*
import com.gs.training.dao.*

class PlantillaServiceSpec extends Specification {

    PlantillaService service
    PlantillaRepository plantillaRepository
    DatosRepository datosRepository

    void setup() {
        plantillaRepository = Mock()
        datosRepository = Mock()
        service = new PlantillaService(plantillaRepository, datosRepository)
    }

    void 'find all'() {
        given:
        def plantilla = new Plantilla("PRUEBA 1")
        def lista = [plantilla]
        plantillaRepository.findAll() >> lista
        
        when:
        def all = service.findAll()

        then:
        all.size() == 1
    }

}
