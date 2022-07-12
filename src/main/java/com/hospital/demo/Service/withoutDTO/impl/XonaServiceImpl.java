package com.hospital.demo.Service.withoutDTO.impl;


import com.hospital.demo.Entity.Xona;
import com.hospital.demo.Repository.DistributedRepository;
import com.hospital.demo.Service.withoutDTO.XonaService;

import org.springframework.stereotype.Service;

@Service
public class XonaServiceImpl extends AbstractService<Xona> implements XonaService {
    public XonaServiceImpl(DistributedRepository<Xona> repository) {super(repository);}

    @Override
    public void someChangesForCreate(Xona entity) {

    }

    @Override
    public void someChangesForUpdate(Xona entity) {

    }

}
