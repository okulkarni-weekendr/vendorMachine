package com.vendorMachine.domain.Users.Employees;

public class CustomerServiceAgent extends Employee {
    public CustomerServiceAgent(int id, String name, String department, boolean working) {
        super(id, name, department, working);
    }

    @Override
    public void performDuties() {
        checkCashTransactions();
        billingDetails();
        customerService();
    }

    private void checkCashTransactions(){
        System.out.println("Cash Transactions");
    }
    private void billingDetails(){
        System.out.println("billing check");
    }
    private void customerService(){
        System.out.println("customer relationship management");
    }

    @Override
    public String toString() {
        return getId() + getName();
    }
}
