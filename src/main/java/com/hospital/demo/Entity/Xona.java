package com.hospital.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Xona extends DistributedEntity{
    private String nom;
    @ManyToOne
    private Bino bino;

}
