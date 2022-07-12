package com.hospital.demo.Service.withoutDTO.impl;

import com.hospital.demo.Entity.Kasallik;
import com.hospital.demo.Repository.DistributedRepository;
import com.hospital.demo.Service.withoutDTO.KasallikService;
import org.springframework.stereotype.Service;

@Service
public class KasallikServiceImpl extends AbstractService<Kasallik> implements KasallikService {
    public KasallikServiceImpl(DistributedRepository<Kasallik> repository) {
        super(repository);
    }

    @Override
    public void someChangesForCreate(Kasallik entity) {

    }

    @Override
    public void someChangesForUpdate(Kasallik entity) {

    }


}
