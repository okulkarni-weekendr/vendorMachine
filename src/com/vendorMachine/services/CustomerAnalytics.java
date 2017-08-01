package com.vendorMachine.services;

import com.vendorMachine.domain.Users.GasStationCustomer;

import java.util.List;

public class CustomerAnalytics implements Analytics<GasStationCustomer> {

    @Override
    public GasStationCustomer top3Transactions(List<> transactions) {
        return null;
    }

    @Override
    public GasStationCustomer top3Picks(List<String> listOfChoices) {
        return null;
    }
}
