package com.vendorMachine;

import java.util.List;
import java.util.Map;

public class vendorMachine {
	private int id;
	private Map<Integer, String> items;
	private List<String> availableItems;
	private String type;

//	public vendorMachine(){
//
//	}

	public int getId() {
		return id;
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

	public void setAvailableItems(List<String> availableItems) {
		this.availableItems = availableItems;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
