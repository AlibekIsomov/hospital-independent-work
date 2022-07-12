package com.hospital.demo.Repository;

import com.hospital.demo.Entity.Kasallik;
import org.springframework.stereotype.Repository;

@Repository
public interface KasallikRepository extends DistributedRepository<Kasallik> {
}
