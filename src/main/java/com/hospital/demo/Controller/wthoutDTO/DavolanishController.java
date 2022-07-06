package com.hospital.demo.Controller.wthoutDTO;


import com.hospital.demo.Entity.Davolanish;
import com.hospital.demo.Service.withoutDTO.CommonService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/davolanish")
public class DavolanishController extends AbstractController<Davolanish> {
    public DavolanishController(CommonService<Davolanish> service) {
        super(service);
    }
}
