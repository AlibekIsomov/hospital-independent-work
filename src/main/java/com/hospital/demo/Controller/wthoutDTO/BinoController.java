package com.hospital.demo.Controller.wthoutDTO;


import com.hospital.demo.Entity.Bino;
import com.hospital.demo.Service.withoutDTO.CommonService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/bino")
public class BinoController extends AbstractController<Bino>{
    public BinoController(CommonService<Bino> service) {
        super(service);
    }
}
