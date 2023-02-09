package com.gs.training.model;

import java.util.List;
import javax.persistence.*;

@Entity
public record Datos (
    @Id @GeneratedValue Long id,
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_plantilla", referencedColumnName = "id")
    Plantilla plantilla,
    
    String tipo,
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_parent", referencedColumnName = "id")
    Datos parent,
    
    @OneToMany(mappedBy = "parent", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    List<Datos> children ) {
}