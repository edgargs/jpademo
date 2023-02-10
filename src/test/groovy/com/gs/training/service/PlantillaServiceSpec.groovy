package com.gs.training.service

import io.micronaut.test.extensions.spock.annotation.MicronautTest

import spock.lang.Specification

import jakarta.inject.Inject

import com.gs.training.entity.*
import com.gs.training.dao.*

@MicronautTest
class PlantillaServiceSpec extends Specification {

    @Inject
    PlantillaService service

    @Inject
    PlantillaRepository plantillaRepository

    void "find all"() {
        when:
        def all = service.findAll()

        then:
        all.size() == 0
    }

    void "save plantilla"() {
        given:
        def plantilla = new Plantilla()
        plantilla.name = "PRUEBA 1"

        when:
        def entity = plantillaRepository.save(plantilla)

        then:
        entity.id != null

    }

}