package com.vendorMachine.client;

import com.vendorMachine.domain.Users.Employees.CustomerServiceAgent;
import com.vendorMachine.domain.Users.Employees.MaintainanceEngineer;
import com.vendorMachine.domain.Users.Employees.StationManagement;

public class CounterClient {

    public static void main(String[] args){
        CustomerServiceAgent agent = new CustomerServiceAgent(1, "Harry", "VendorMachine Management", true);
        MaintainanceEngineer engineer = new MaintainanceEngineer(1, "Danny", "Stevens", true);
        StationManagement stationManagement = new StationManagement();

        stationManagement.callUpon(agent);
        System.out.println("This is a doctor responsibility: ");
        stationManagement.callUpon(engineer);

    }

}
