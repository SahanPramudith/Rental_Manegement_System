package com.icet.crm.Service;

import com.icet.crm.Model.Customer;

import java.util.List;

public interface CustomerService {
    void saveCoustomer(Customer customer);

    List<Customer> getCustomer();

    List<Customer> searchById(Integer id);


}
