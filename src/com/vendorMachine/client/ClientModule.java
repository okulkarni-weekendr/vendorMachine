package com.vendorMachine.client;

import com.vendorMachine.Analytics.CustomerReportFormatter;
import com.vendorMachine.Analytics.FormatType;
import com.vendorMachine.domain.dao.GasStationCustomerDAO;
import com.vendorMachine.domain.Users.Customer;
import com.vendorMachine.domain.Users.GasStationCustomer;

public class ClientModule {

	public static void main(String args[]){
		GasStationCustomer gasStationCustomer = new GasStationCustomer(1, "Omkar", "kulkarni");
		ClientModule.addNewCustomer(gasStationCustomer);
		printCustomerReport(gasStationCustomer, FormatType.XML);
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

	public static void printCustomerReport(GasStationCustomer gasStationCustomer, FormatType format){
		CustomerReportFormatter formatter = new CustomerReportFormatter(gasStationCustomer, format);
		System.out.println(formatter.getFormattedCustomer());
	}
}
