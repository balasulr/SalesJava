package com.maxtrain.bootcamp.sales;

public class Orderline {
	
	private static int nextId = 1;
	
	private int id;
	private int quantity;
	private Product product;
	
	
	public Orderline(int quantity, Product product) {
		this.setId(nextId++);
		this.setQuantity(quantity);
		this.setProduct(product);
	}
	
	public String toString() {
		return getId() + "|"
				+ getProduct().getName() + "|"
				+ getQuantity() + "|"
				+ getQuantity() * getProduct().getPrice();
	}
	public void log() {
		System.out.println(this);
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
