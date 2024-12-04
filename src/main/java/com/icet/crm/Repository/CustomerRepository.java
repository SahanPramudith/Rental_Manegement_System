package com.icet.crm.Repository;

import com.icet.crm.Entity.CustomerEntity;
import com.icet.crm.Model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<CustomerEntity, Integer> {
    void findById(String id);

    List<CustomerEntity> findAllById(String id);

    List<CustomerEntity> findAllByid(String id);
}
