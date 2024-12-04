package com.icet.crm.Controller;

import com.icet.crm.Service.CustomerService;
import com.icet.crm.Model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService service;

    @PostMapping("/saveCustomer")
    void save(@RequestBody Customer customer){
        service.saveCoustomer(customer);
    }
    @PutMapping("/updateCustomer")
    void update(@RequestBody Customer customer){
        service.saveCoustomer(customer);
    }
    @GetMapping("/getCustomer")
    List<Customer>getAllCustomer(){
        return service.getCustomer();
    }
    @GetMapping("/searchid/{id}")
    List<Customer>getAllCustomer(@PathVariable Integer id){
        return service.searchById(id);
    }
}
