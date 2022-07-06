package com.hospital.demo.Controller.wthoutDTO;

import com.hospital.demo.Entity.Xona;


import com.hospital.demo.Service.withoutDTO.CommonService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/xona")
public class XonaController extends AbstractController<Xona> {
    public XonaController(CommonService<Xona> service) {
        super(service);
    }
}
