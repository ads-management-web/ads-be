package com.adsmanagement.spaces;


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
@RequestMapping(path = "/api/v1/spaces")
public class SpaceController {
    private final SpaceService spaceService;

    @Autowired
    public SpaceController(SpaceService spaceService) {
        this.spaceService = spaceService;
    }

    @GetMapping(path = "")
    public ResponseEntity<Response<Iterable<Space>>> list() {
        var data = this.spaceService.findAll();
        var res = new Response<>("",data);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

}
