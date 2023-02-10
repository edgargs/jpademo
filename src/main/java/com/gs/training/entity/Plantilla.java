package com.gs.training.entity;

import java.util.List;
import javax.persistence.*;

@Entity
public class Plantilla {
    @Id @GeneratedValue 
    private Long id;
    
    private String name;
    
    @OneToMany(mappedBy = "plantilla", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Datos> datos;

    //TODO getters & setters
    public Long getId() {
        return this.id;
    }
}