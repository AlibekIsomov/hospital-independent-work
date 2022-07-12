package com.hospital.demo.Entity;



import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Bemor extends DistributedEntity{
    private String name;
    private String surname;
    @ManyToOne
    private Yunalish BemorYunalish;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

}