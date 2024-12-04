package com.icet.crm.Service;

import com.icet.crm.Model.Item;
import com.icet.crm.Repository.CustomerRepository;
import com.icet.crm.Repository.ItemRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public interface ItemService {


    void addItem(Item item);
}
