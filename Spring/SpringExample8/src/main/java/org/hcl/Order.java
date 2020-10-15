package org.hcl;

import org.springframework.stereotype.Component;

@Component
public class Order {
	String itemName;
	double price;
	public Order()
	{
		
	}
	public Order(String itemName, double price) {
		super();
		this.itemName = itemName;
		this.price = price;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
