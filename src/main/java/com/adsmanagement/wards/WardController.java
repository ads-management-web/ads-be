package com.adsmanagement.wards;


import com.adsmanagement.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "/api/v1/wards")
public class WardController {
    private final WardService wardService;

    @Autowired
    public WardController(WardService wardService) {
        this.wardService = wardService;
    }

    @GetMapping(path = "")
    public ResponseEntity<Response<Iterable<Ward>>> list() {
        var data = this.wardService.findAll();
        var res = new Response<>("",data);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

}
