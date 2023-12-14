package com.adsmanagement.districts;


import com.adsmanagement.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "/api/v1/districts")
public class DistrictController {
    private final DistrictService districtService;

    @Autowired
    public DistrictController(DistrictService districtService) {
        this.districtService = districtService;
    }

    @GetMapping(path = "")
    public ResponseEntity<Response<Iterable<District>>> list() {
        var data = this.districtService.findAll();
        var res = new Response<>("",data);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

}
