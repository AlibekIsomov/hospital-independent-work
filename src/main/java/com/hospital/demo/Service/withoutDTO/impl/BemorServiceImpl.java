package com.hospital.demo.Service.withoutDTO.impl;

import com.hospital.demo.Entity.Bemor;
import com.hospital.demo.Repository.DistributedRepository;
import com.hospital.demo.Service.withDTO.BemorService;

import org.springframework.stereotype.Service;

@Service
public class BemorServiceImpl extends AbstractService<Bemor> implements BemorService {
    public BemorServiceImpl(DistributedRepository<Bemor> repository) {super(repository); }
    @Override
    public void someChangesForCreate(Bemor Entity){


    }
    @Override
    public void someChangesForUpdate(Bemor Entity){

    }

}
