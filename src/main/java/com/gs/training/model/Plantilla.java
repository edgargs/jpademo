package com.gs.training.model;

import java.util.List;
import javax.persistence.*;

@Entity
public record Plantilla (
    @Id @GeneratedValue Long id,
    String name,
    @OneToMany(mappedBy = "plantilla", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    List<Datos> datos ) {
        public Plantilla(String name) {
            this(null, name, null);
        }
}