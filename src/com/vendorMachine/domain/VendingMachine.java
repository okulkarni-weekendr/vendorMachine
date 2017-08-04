package com.vendorMachine.domain;

import java.util.List;
import java.util.Map;

public class VendingMachine extends Machine{
	private int id;
	private Map<Integer, String> items;
	private List<String> availableItems;
	private String type;
	private enum Drinks {
		COKE,
		PEPSI,
		SODA
	}

	@Override
	public void details() {
		System.out.println("This is a vending machine");
	}

	@Override
	public String getId() {
		System.out.println("Id registered is: " + id);
		return Integer.toString(id) ;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Map<Integer, String> getItems() {
		return items;
	}

	public void setItems(Map<Integer, String> items) {
		this.items = items;
	}

	public List<String> getAvailableItems() {
		return availableItems;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void printWelcomeMessage() {
		System.out.println("This machine is for \n" + Drinks.COKE + Drinks.PEPSI + Drinks.SODA);
	}
}
