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

    @Inject
    DatosRepository datosRepository

    @spock.lang.Ignore
    void "save plantilla"() {
        given:
        def plantilla = new Plantilla()
        plantilla.name = "PRUEBA 1"

        when:
        def entity = plantillaRepository.save(plantilla)

        then:
        entity.id != null
        println entity.id
    }

    void "find all"() {
        given:
        def plantilla = new Plantilla()
        plantilla.name = "PRUEBA 1"

        when:
        def entity = plantillaRepository.save(plantilla)

        def all = service.findAll()

        then:
        all.size() == 1
    }

    void "list childs"() {
        given:
        def col1 = new Datos()
        col1.tipo = "COLUMNA1"
        
        def col2 = new Datos()
        col2.tipo = "COLUMNA2"

        def tabla = new Datos()
        tabla.tipo = "TABLA"
        tabla.children = [col1, col2] //

        def plantilla = new Plantilla()
        plantilla.name = "PRUEBA 2"
        plantilla.datos = [tabla] //

        plantillaRepository.save(plantilla)

        when:        
        def entity = service.findById(plantilla.id)

        then:
        entity.datos[0].children.size() == 2 //
    }
}