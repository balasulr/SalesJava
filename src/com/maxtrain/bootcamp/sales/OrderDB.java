package com.maxtrain.bootcamp.sales;

import java.util.ArrayList;

public class OrderDB {

	private ArrayList<Order> orders = new ArrayList<Order>();
	
	public void addOrderline(Order order, Orderline orderline) throws Exception {
		if(order == null) {
			throw new Exception("Missing order instance");
		}
		order.getOrderLines().add(orderline);
	}
	/* Work in progress
	public boolean deleteOrderline(Order order, int id) {
		for(var ol : order.getOrderLines()); {
			if(ol.getId() == id) {
				order.getOrderLines().remove(ol);
				return true;
			}	
		}
		return false;
	}
	*/
	public Order[] getAll() {
		Order[] ords = new Order[orders.size()]; // Size shows how many items are in array
		for(var i = 0; i < orders.size(); i++) {
			ords[i] = orders.get(i);
		}
		return ords;
	}
	
	public Order getByPk(int id) {
		for(var ord : orders) { // Java's version of the foreach statement in C#
			if(ord.getId() == id) {
				return ord;
			}
		}
		return null;
	}
	
	public void add(Order order) {
		orders.add(order);
	}
	
	public boolean delete(int id) {
		var ord = getByPk(id);
		if(ord == null) {
			return false;
		}
		orders.remove(ord);
		return true;
	}
}
