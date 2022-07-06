package com.hospital.demo.Controller.wthoutDTO;


import com.hospital.demo.Entity.Shifokor;
import com.hospital.demo.Service.withoutDTO.CommonService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/Shifokor")
public class ShifokorController extends AbstractController<Shifokor> {
    public ShifokorController(CommonService<Shifokor> service) {
        super(service);
    }
}
