package com.vendorMachine.domain.dao;

import com.vendorMachine.domain.Customer;

import java.util.List;

public interface CustomerDAOInterface<T> {
    boolean saveCustomer(T customer);
    List<?> findAll();
    T getCustomerDetails();
    boolean deleteCustomer(T customer);
    boolean updateCustomer(T customer);
}
