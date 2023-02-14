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
    
    //getters & setters
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Plantilla getPlantilla() {
        return this.plantilla;
    }

    public void setPlantilla(Plantilla plantilla) {
        this.plantilla = plantilla;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Datos getParent() {
        return this.parent;
    }

    public void setParent(Datos parent) {
        this.parent = parent;
    }

    public List<Datos> getChildren() {
        return this.children;
    }

    public void setChildren(List<Datos> children) {
        this.children = children;
    }
}