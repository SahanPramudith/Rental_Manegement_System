package com.icet.crm.Service.IMpl;

import com.icet.crm.Entity.ItemEntity;
import com.icet.crm.Model.Item;
import com.icet.crm.Repository.ItemRepository;
import com.icet.crm.Service.ItemService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
