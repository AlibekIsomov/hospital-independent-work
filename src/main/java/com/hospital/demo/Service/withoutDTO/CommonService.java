package com.hospital.demo.Service.withoutDTO;

import com.hospital.demo.Entity.DistributedEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CommonService<ENTITY extends DistributedEntity>{
    public Page<ENTITY> getAll(Pageable pageable);
    public ENTITY create(ENTITY entity) throws Exception;
    public ENTITY update (ENTITY entity);
    public ENTITY getById(Long id);
    public boolean delete(Long id);
}
