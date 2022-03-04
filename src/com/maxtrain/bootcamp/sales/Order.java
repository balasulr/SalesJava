package com.maxtrain.bootcamp.sales;

import java.util.ArrayList;

public class Order {
	
	private int id;
	private String description;
	private double total;
	private Customer customer; // Ties the Order to a customer
	private ArrayList<Orderline> orderLines;
	
	
	
	public int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
