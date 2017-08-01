package com.vendorMachine.domain.Users;

import com.vendorMachine.domain.Customer;
import com.vendorMachine.domain.Machine;

import java.util.List;
import java.util.Map;

public class GasStationCustomer extends Customer {
    private int id;
    private String firstName;
    private String lastName;

    public GasStationCustomer(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public float transact(float gasLitres, float currentGasPrice) {
        return gasLitres * currentGasPrice;
    }

    @Override
    public List<?> setChoice() {
        return null;
    }

    @Override
    public List<?> getTransactions() {
        return null;
    }

    @Override
    public Map<String, String> getDetails() {
        return null;
    }

    @Override
    public List<Integer> findExactChange(Machine machine) {
        return null;
    }

    @Override
    public String toString() {
        return "GasStationCustomer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
