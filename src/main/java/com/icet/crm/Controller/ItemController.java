package com.icet.crm.Controller;


import com.icet.crm.Model.Item;
import com.icet.crm.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}
