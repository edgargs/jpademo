package com.gs.training.model;

import java.util.List;

public record Plantilla (
    Long id,
    String name,
    List<Datos> datos ) {
        public Plantilla(String name) {
            this(null, name, null);
        }
}