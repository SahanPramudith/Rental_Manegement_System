package com.icet.crm.Repository;

import com.icet.crm.Entity.ItemEntity;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<ItemEntity,Integer> {
}
