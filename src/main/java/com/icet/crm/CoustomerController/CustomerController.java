package com.icet.crm.CoustomerController;

import com.icet.crm.CoustomerService.CustomerService;
import com.icet.crm.Model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CustomerController {
    @Autowired
    CustomerService service;

    @PostMapping("/saveCustomer")
    void save(@RequestBody Customer customer){
        service.saveCoustomer(customer);
    }
    @GetMapping("/getCustomer")
    List<Customer>getAllCustomer(){
        return service.getCustomer();
    }
}
