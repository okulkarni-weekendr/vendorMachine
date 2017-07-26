package com.vendorMachine;

import java.util.*;

public class Main {

    public static void main(String[] args) {
		// write your code here

		VendingMachine vendingMachine = new VendingMachine();
		ATMMachine atmMachine = new ATMMachine();


		//using atmMachine class
		atmMachine.details();
		vendingMachine.details();

		//setting id
		vendingMachine.setId(2);
		System.out.println(vendingMachine.getId());

		Map<Integer, String> items = new HashMap<Integer, String>();
		items.put(25, "Coke");
		items.put(35, "Pepsi");
		items.put(45, "Soda");

		//setting items hashmap
		vendingMachine.setItems(items);

		Map<Integer, String> vendorMachineItems = vendingMachine.getItems();

		for (Map.Entry<Integer, String> entry : vendorMachineItems.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
	}
}
