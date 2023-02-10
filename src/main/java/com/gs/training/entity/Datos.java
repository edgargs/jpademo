package com.gs.training.entity;

import java.util.List;
import javax.persistence.*;

@Entity
public class Datos {
    @Id @GeneratedValue 
    private Long id;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_plantilla", referencedColumnName = "id")
    private Plantilla plantilla;
    
    private String tipo;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_parent", referencedColumnName = "id")
    private Datos parent;
    
    @OneToMany(mappedBy = "parent", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Datos> children;
    
    //TODO getters & setters
    public Long getId() {
        return this.id;
    }
}