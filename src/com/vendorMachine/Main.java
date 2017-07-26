package com.vendorMachine;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

		vendorMachine vendorMachine = new vendorMachine();

		//setting id
		vendorMachine.setId(2);
		System.out.println(vendorMachine.getId());

		Map<Integer, String> items = new HashMap<Integer, String>();
		items.put(25, "Coke");
		items.put(35, "Pepsi");
		items.put(45, "Soda");


		//setting items hashmap
		vendorMachine.setItems(items);
		
		Map<Integer, String> vendorMachineItems = vendorMachine.getItems();

		for (Map.Entry<Integer, String> entry : vendorMachineItems.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}





    }
}
