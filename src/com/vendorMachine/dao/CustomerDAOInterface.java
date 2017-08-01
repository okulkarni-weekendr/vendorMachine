package com.vendorMachine.dao;

import com.vendorMachine.domain.Customer;

import java.util.List;

public interface CustomerDAOInterface<T> {
    List<?> findAll();
    T getCustomerDetails();
    boolean deleteCustomer(T customer);
    boolean updateCustomer(T customer);
}
