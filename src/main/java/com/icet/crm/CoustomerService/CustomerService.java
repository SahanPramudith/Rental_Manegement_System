package com.icet.crm.CoustomerService;

import com.icet.crm.Model.Customer;

import java.util.List;

public interface CustomerService {
    void saveCoustomer(Customer customer);

    List<Customer> getCustomer();
}
