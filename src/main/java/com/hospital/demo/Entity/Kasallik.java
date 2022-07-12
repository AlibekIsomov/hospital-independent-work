package com.hospital.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Kasallik extends DistributedEntity{
    @ManyToOne
    private Ktur yunalish;

    public Ktur getYunalish() {
        return yunalish;
    }

    public void setYunalish(Ktur yunalish) {
        this.yunalish = yunalish;
    }
    
}
