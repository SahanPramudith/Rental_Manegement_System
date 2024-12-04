package com.icet.crm.Repository;

import com.icet.crm.Entity.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Integer, CustomerEntity> {
}
