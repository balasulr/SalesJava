package com.maxtrain.bootcamp.sales;

import java.util.ArrayList;

public class CustomerDb { // Simulates a Database to keep a collection of Customers

	private ArrayList<Customer> customers = new ArrayList<Customer>();

	public void add(Customer customer) throws Exception { // Method to add a customer instance that is added in
		customers.add(customer);
	}
	
	public boolean delete(int id) {
		var cust = getByPk(id);
		if(cust == null) {
			return false;
		}
		customers.remove(cust); // Will remove from collection then return true
		return true;
	}

	public Customer[] getAll() { // get all customers back in a fixed array
		var custs = new Customer[customers.size()];
		for(var i = 0; i < customers.size(); i++) {
			custs[i] = customers.get(i);
		}
		return custs;
	}

	public Customer getByPk(int id) {
		for(var cust : customers) { // Similar to Foreach statement in C#
			if(cust.getId() == id) {
				return cust;
			}
		}
		return null;
	}

}
