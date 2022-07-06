package com.hospital.demo.Controller.wthoutDTO;

import com.hospital.demo.Entity.Kasallik;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hospital.demo.Service.withoutDTO.CommonService;

@RestController
@RequestMapping("/api/kassalik")
public class KassalikController extends AbstractController<Kasallik> {
    public KassalikController(CommonService<Kasallik> service) {
        super(service);
    }
}
