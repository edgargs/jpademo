package com.gs.training.service

import spock.lang.Specification

import com.gs.training.entity.*
import com.gs.training.dao.*

class PlantillaServiceMockSpec extends Specification {

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
        def plantilla = new Plantilla()
        plantilla.name = "PRUEBA 1"
        def lista = [plantilla]
        //plantillaRepository.findAll() >> lista
        
        when:
        def all = service.findAll()

        then:
        1 * plantillaRepository.findAll() >> lista
        all.size() == 1
    }

}
