package com.icet.crm.Controller;


import com.icet.crm.Model.Customer;
import com.icet.crm.Model.Item;
import com.icet.crm.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/item")
public class ItemController {
    @Autowired
    ItemService service;

    @PostMapping("/addItem")
    void saveItem(@RequestBody Item item){
        service.addItem(item);
    }
    @GetMapping("/getitem")
    List<Item>getItem(){
        return service.getAllItem();
    }
    @GetMapping("/searchid/{id}")
    List<Item>getAllCustomer(@PathVariable Integer id){
        return service.searchById(id);
    }
}
