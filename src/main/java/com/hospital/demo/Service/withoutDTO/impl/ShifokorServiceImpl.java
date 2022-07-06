package com.hospital.demo.Service.withoutDTO.impl;

import com.hospital.demo.Entity.Shifokor;
import com.hospital.demo.Repository.DistributedRepository;
import com.hospital.demo.Service.withDTO.ShifokorService;

import org.springframework.stereotype.Service;

@Service
public class ShifokorServiceImpl extends AbstractService<Shifokor> implements ShifokorService {
    public ShifokorServiceImpl(DistributedRepository<Shifokor> repository) {
        super(repository);
    }

    @Override
    public void someChangesForCreate(Shifokor entity) {

    }

    @Override
    public void someChangesForUpdate(Shifokor entity) {

    }
}
