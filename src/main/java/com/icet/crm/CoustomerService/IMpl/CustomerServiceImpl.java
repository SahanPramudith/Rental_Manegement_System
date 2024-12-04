package com.icet.crm.CoustomerService.IMpl;

import com.icet.crm.CoustomerService.CustomerService;
import com.icet.crm.Entity.CustomerEntity;
import com.icet.crm.Model.Customer;
import com.icet.crm.Repository.CustomerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository repository;
    @Autowired
    ModelMapper mapper;



    @Override
    public void saveCoustomer(Customer customer) {
        repository.save(mapper.map(customer, CustomerEntity.class));
    }

    @Override
    public List<Customer> getCustomer() {
        ArrayList<Customer> getCustomerAll = new ArrayList<>();
        for (CustomerEntity customerEntity : repository.findAll()) {
            getCustomerAll.add(mapper.map(customerEntity,Customer.class));
        }

        return getCustomerAll;
    }
}
