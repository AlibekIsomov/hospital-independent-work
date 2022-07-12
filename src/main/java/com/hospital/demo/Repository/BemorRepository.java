package com.hospital.demo.Repository;

import com.hospital.demo.Entity.Bemor;
import org.springframework.stereotype.Repository;

@Repository
public interface BemorRepository extends DistributedRepository<Bemor> {
}
