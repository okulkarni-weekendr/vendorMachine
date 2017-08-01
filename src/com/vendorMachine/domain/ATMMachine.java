package com.vendorMachine.domain;

import com.vendorMachine.MachineInterface;

/**
 * Created by omkulk on 7/26/2017.
 */
public class ATMMachine extends Machine implements MachineInterface {

    @Override
    public void details() {
        System.out.println("This is a high denomination ATM machine");
    }

    @Override
    public void printWelcomeMessage() {
        System.out.println("<<--------------Welcome to the ATM Machine-------------->>");
    }
}
