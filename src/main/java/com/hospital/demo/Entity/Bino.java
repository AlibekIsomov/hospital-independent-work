package com.hospital.demo.Entity;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Bino extends DistributedEntity {
    private String Nom;
    private String surname;
    @ManyToOne
    private YunalishSh yunalish;
    
    public String getNom() {
        return Nom;
    }
    public void setNom(String nom) {
        Nom = nom;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public YunalishSh getYunalish() {
        return yunalish;
    }
    public void setYunalish(YunalishSh yunalish) {
        this.yunalish = yunalish;
    }
    
}
