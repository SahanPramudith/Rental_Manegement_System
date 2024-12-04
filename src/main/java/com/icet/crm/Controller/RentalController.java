package com.icet.crm.Controller;

import com.icet.crm.Model.Rental;
import com.icet.crm.Service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/rental")
public class RentalController {
    @Autowired
    RentalService service;

    @PostMapping("/save")
    void save(@RequestBody Rental rental){
        service.save(rental);
    }
    @GetMapping("/get")
    List<Rental> getAll(){
        return service.getAll();
    }
}


