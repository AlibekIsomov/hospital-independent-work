package com.hospital.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Shifokor extends DistributedEntity{
    private String name;
    @ManyToOne
    private YunalishSh yunalishi;
}
