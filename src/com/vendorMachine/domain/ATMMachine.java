package com.vendorMachine.domain;



/**
 * Created by omkulk on 7/26/2017.
 */
public class ATMMachine extends Machine{

    @Override
    public void details() {
        System.out.println("This is a high denomination ATM machine");
    }


	private void printWelcomeMessage() {
        System.out.println("<<--------------Welcome to the ATM Machine-------------->>");
    }
}
