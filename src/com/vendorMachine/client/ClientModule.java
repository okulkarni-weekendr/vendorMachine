package com.vendorMachine.client;

import com.vendorMachine.domain.dao.GasStationCustomerDAO;
import com.vendorMachine.domain.Customer;
import com.vendorMachine.domain.Users.GasStationCustomer;

public class ClientModule {

	public static void main(String args[]){
		GasStationCustomer gasStationCustomer = new GasStationCustomer(1, "Omkar", "kulkarni");
		ClientModule.addNewCustomer(gasStationCustomer);

	}

	public static void addNewCustomer(Customer customer){
		GasStationCustomerDAO gasStationCustomerDAO = new GasStationCustomerDAO();
		gasStationCustomerDAO.saveCustomer(customer);
	}

	public static boolean deleteCustomer(Customer customer){
		GasStationCustomerDAO gasStationCustomerDAO = new GasStationCustomerDAO();
		boolean val = gasStationCustomerDAO.deleteCustomer(customer);
		return val;
	}
}
