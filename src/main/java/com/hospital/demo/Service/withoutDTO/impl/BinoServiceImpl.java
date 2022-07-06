package com.hospital.demo.Service.withoutDTO.impl;


import com.hospital.demo.Entity.Bino;
import com.hospital.demo.Repository.DistributedRepository;
import com.hospital.demo.Service.withDTO.BinoService;

import org.springframework.stereotype.Service;

@Service
public class BinoServiceImpl extends AbstractService<Bino> implements BinoService {
    public BinoServiceImpl(DistributedRepository<Bino> repository) {super(repository);}

    @Override
    public void someChangesForCreate(Bino entity) {

    }

    @Override
    public void someChangesForUpdate(Bino entity) {

    }

}
