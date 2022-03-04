package com.maxtrain.bootcamp.sales;

public class Product {

	private static int nextId = 1;
	
	private int id;
	private String partNbr;
	private String name;
	private double price;
	
	public Product(String partNbr, String name, double price) { // Product Constructor that has 3 parameters
		this.setId(nextId++);
		this.setPartNbr(partNbr);
		this.setName(name);
		this.setPrice(price);
	}
	
	public String toString() {
		return getId() + "|"
				+ getPartNbr() + "|"
				+ getName() + "|"
				+ getPrice();
	}
	public void log() { // Shows all info
		System.out.println(this);
	}
	
	public int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	public String getPartNbr() {
		return partNbr;
	}
	public void setPartNbr(String partNbr) {
		this.partNbr = partNbr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
