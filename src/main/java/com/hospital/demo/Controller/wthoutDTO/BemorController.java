package com.hospital.demo.Controller.wthoutDTO;


import com.hospital.demo.Entity.Bemor;
;

import com.hospital.demo.Service.withoutDTO.CommonService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/bemor")
public class BemorController extends AbstractController<Bemor> {
    public BemorController(CommonService<Bemor> service) {
        super(service);
    }
}
