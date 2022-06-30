package com.hospital.demo.Entity;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Davolanish extends DistributedEntity{
@ManyToOne
    private Bemor bemor;
@ManyToOne
    private Shifokor Shifokor;
@ManyToOne
    private Kasallik kasallik;
@ManyToOne
    private Xona xona;

}
