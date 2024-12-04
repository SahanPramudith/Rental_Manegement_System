package com.icet.crm.Repository;

import com.icet.crm.Entity.CustomerEntity;
import com.icet.crm.Entity.ItemEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItemRepository extends CrudRepository<ItemEntity,Integer> {
    List<ItemEntity> findByid(Integer id);
}
