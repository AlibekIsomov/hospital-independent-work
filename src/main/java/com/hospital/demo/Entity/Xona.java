package com.hospital.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Xona extends DistributedEntity{
    private String nom;
    @ManyToOne
    private Bino bino;
    
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public Bino getBino() {
        return bino;
    }
    public void setBino(Bino bino) {
        this.bino = bino;
    }

}
