package com.icet.crm.Service.IMpl;

import com.icet.crm.Entity.CustomerEntity;
import com.icet.crm.Entity.ItemEntity;
import com.icet.crm.Model.Customer;
import com.icet.crm.Model.Item;
import com.icet.crm.Repository.ItemRepository;
import com.icet.crm.Service.ItemService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemImpl implements ItemService {

    @Autowired
    ModelMapper mapper;
    @Autowired
    ItemRepository repository;

    @Override
    public void addItem(Item item) {
        repository.save(mapper.map(item, ItemEntity.class));
    }

    @Override
    public List<Item> getAllItem() {
        ArrayList<Item> getItem = new ArrayList<>();
        for (ItemEntity itemEntity : repository.findAll()) {
            getItem.add(mapper.map(itemEntity, Item.class));
        }

        return getItem;
    }

    @Override
    public List<Item> searchById(Integer id) {
        ArrayList<Item> getItemById = new ArrayList<>();
        for (ItemEntity itemEntity : repository.findByid(id)) {
            getItemById.add(mapper.map(itemEntity,Item.class));
        }

        return null;
    }
}
