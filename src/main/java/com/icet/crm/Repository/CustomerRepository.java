package com.icet.crm.Repository;

import com.icet.crm.Entity.CustomerEntity;
import com.icet.crm.Model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<CustomerEntity, Integer> {




    List<CustomerEntity> findByid(Integer id);
}
