package com.gs.training.service

import io.micronaut.test.extensions.spock.annotation.MicronautTest

import spock.lang.Specification

import jakarta.inject.Inject

@MicronautTest
class PlantillaServiceSpec extends Specification {

    @Inject
    PlantillaService service

    void "find All"() {
        given:

        when:
        def all = service.findAll()

        then:
        all.size() == 0

    }

}