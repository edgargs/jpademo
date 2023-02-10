package com.gs.training.model;

import java.util.List;

public record Datos (
    Long id,
    Plantilla plantilla,
    String tipo,
    Datos parent,
    List<Datos> children ) {
}