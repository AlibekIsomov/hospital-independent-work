package com.hospital.demo.Repository;

import com.hospital.demo.Entity.Fayl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaylRepository extends JpaRepository<Fayl, Long> {
}
