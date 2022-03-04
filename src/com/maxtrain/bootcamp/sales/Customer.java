package com.maxtrain.bootcamp.sales;

public class Customer {
	
	private static int nextId = 1;
	
	private int id;
	private String name;
	private String city;
	private String stateCode;
	private boolean active;
	private double sales;
	// Overloading the constructors for when creating Customers
	public Customer() { // Generated when there are no fields passed into the Constructor
		this("New Customer");
	}
	public Customer(String name) { // Generated when the name field is passed into the Constructor
		this(name, "Mason", "OH");
	}
	public Customer(String name, String city, String stateCode) { // Generated when name, city and stateCode is passed into the Constructor
		this.setId(nextId++); // Increments the ids
		//nextId++; //// Increments the ids for the customers. With this one, the above would be this.setId(nextId)
		this.setName(name);
		this.setCity(city);
		this.setStateCode(stateCode);
		this.setActive(true);
		this.setSales(0);
	}
	public String toString() { // Overriding the toString
		return this.getId() + "|" + this.getName() + "|"
				+ this.getCity() + "|" + this.getStateCode() + "|"
				+ this.isActive() + "|" + this.getSales();
	}
	public void log() { // Will show all of the info
		System.out.println(this);
	}
	
	
	public int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public boolean isActive() { // Has isActive instead of getActive since it is a boolean
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public double getSales() {
		return sales;
	}
	private void setSales(double sales) {
		this.sales = sales;
	}

}
