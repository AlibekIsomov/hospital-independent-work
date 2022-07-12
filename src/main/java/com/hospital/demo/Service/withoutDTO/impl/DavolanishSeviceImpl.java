package com.hospital.demo.Service.withoutDTO.impl;


import com.hospital.demo.Entity.Davolanish;
import com.hospital.demo.Repository.DistributedRepository;
import com.hospital.demo.Service.withoutDTO.DavolanishService;
import org.springframework.stereotype.Service;

@Service
public class DavolanishSeviceImpl extends AbstractService<Davolanish> implements DavolanishService {
    public DavolanishSeviceImpl(DistributedRepository<Davolanish> repository) {
        super(repository);
    }

    @Override
    public void someChangesForCreate(Davolanish entity) {

    }

    @Override
    public void someChangesForUpdate(Davolanish entity) {

    }
}
