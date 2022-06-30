package com.hospital.demo.Entity;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Bino extends DistributedEntity {
    private String Nom;
    private String surname;
    @ManyToOne
    private YunalishSh yunalish;
}
