package com.hospital.demo.Repository;

import com.hospital.demo.Entity.Bemor;
import javax.persistence.Entity;

@Entity
public interface BemorRepository extends DistributedRepository<Bemor> {
}
