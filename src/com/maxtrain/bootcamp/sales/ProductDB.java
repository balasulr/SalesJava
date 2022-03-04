package com.maxtrain.bootcamp.sales;

import java.util.ArrayList;

public class ProductDB {
	
	private ArrayList<Product> products = new ArrayList<Product>();
	
	public Product[] getAll() { // Method that returns a instance
		Product[] prods = new Product[products.size()]; // Size shows how many items are in array
		for(var i = 0; i < products.size(); i++) {
			prods[i] = products.get(i);
		}
		return prods;
	}
	
	public Product getByPk(int id) {
		for(var product : products) { // Java's version of the foreach statement in C#
			if(product.getId() == id) {
				return product;
			}
		}
		return null;
	}
	
	public Product getByPartNbr(String partNbr) {
		for(var product : products) {
			if(product.getPartNbr() == partNbr) {
				return product;
			}
		}
		return null;
	}
	
	public void add(Product product) {
		products.add(product);
	}
	
	public boolean delete(int id) {
		var prod = getByPk(id);
		if(prod == null) {
			return false;
		}
		products.remove(prod);
		return true;
	}

}
