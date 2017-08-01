package com.vendorMachine.domain.dao;
import com.vendorMachine.domain.Users.GasStationCustomer;

import java.util.List;

public class GasStationCustomerDAO implements CustomerDAOInterface {

	@Override
	public boolean saveCustomer(Object customer) {
		System.out.println("Saving Customer" + customer);
		return true;
	}

	@Override
    public List<GasStationCustomer> findAll() {
        return null;
    }

    @Override
    public GasStationCustomer getCustomerDetails() {
        return null;
    }

    @Override
    public boolean deleteCustomer(Object customer) {
        return false;
    }

    @Override
    public boolean updateCustomer(Object customer) {
        return false;
    }

}
