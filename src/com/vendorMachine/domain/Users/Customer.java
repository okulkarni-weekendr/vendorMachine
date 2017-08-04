package com.vendorMachine.domain.Users;

import com.vendorMachine.domain.Machine;

import java.util.List;
import java.util.Map;

/**
 * Created by omkulk on 7/27/2017.
 */
public abstract class Customer {

    public abstract float transact(float gasLiters, float currentGasPrice);
    public abstract List<?> setChoice();
    public abstract List<?> getTransactions();
    public abstract Map<String, String> getDetails();

    //association
    public abstract List<Integer> findExactChange(Machine machine);

}
