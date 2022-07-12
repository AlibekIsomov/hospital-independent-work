package com.hospital.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Shifokor extends DistributedEntity{
    private String name;
    @ManyToOne
    private YunalishSh yunalishi;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public YunalishSh getYunalishi() {
        return yunalishi;
    }
    public void setYunalishi(YunalishSh yunalishi) {
        this.yunalishi = yunalishi;
    }

}
