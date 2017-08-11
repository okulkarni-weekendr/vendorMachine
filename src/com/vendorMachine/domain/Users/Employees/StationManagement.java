package com.vendorMachine.domain.Users.Employees;

//Strategy pattern
public class StationManagement {
    public void callUpon(Employee employee){
      employee.performDuties();
    }
}
