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
    
public Bemor getBemor() {
    return bemor;
}
public void setBemor(Bemor bemor) {
    this.bemor = bemor;
}
public Shifokor getShifokor() {
    return Shifokor;
}
public void setShifokor(Shifokor shifokor) {
    Shifokor = shifokor;
}
public Kasallik getKasallik() {
    return kasallik;
}
public void setKasallik(Kasallik kasallik) {
    this.kasallik = kasallik;
}
public Xona getXona() {
    return xona;
}
public void setXona(Xona xona) {
    this.xona = xona;
}

}
