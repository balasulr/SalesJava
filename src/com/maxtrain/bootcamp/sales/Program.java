package com.maxtrain.bootcamp.sales;

public class Program {

	public static void main(String[] args) {
		
		var pdb = new ProductDB();
		var odb = new OrderDB();
		var db = new CustomerDb();
		
		var cust1 = new Customer("Test Customer");
		var o1 = new Order("1st Order", cust1);
		
		var pdb1 = new ProductDB();
		var echo = pdb1.getByPartNbr("ECHO");
		var oline = new Orderline(1, echo);
		
		var o2 = new Order("2nd Order", cust1);
		var o3 = new Order("3rd Order", cust1);
		
		try {
			
			odb.add(o1);
			odb.add(o2);
			odb.add(o3);
			
			for(var ord : odb.getAll()) {
				ord.log();
			}
			
			odb.addOrderline(o1, oline);
			
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		var p1 = new Product("ECHO", "Echo", 100);
		var p2 = new Product("ECHODOT", "Echo Dot", 50);
		var p3 = new Product("FIRETV", "Fire TV", 150);
		
		try {
			
			pdb.add(p1);
			pdb.add(p2);
			pdb.add(p3);
			
			for(var prod : pdb.getAll()) {
				prod.log();
			}
			
			var pcode = pdb.getByPartNbr("ECHODOT");
			pcode.log();
			
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		var c1 = new Customer();
		var c2 = new Customer("ACME MFG.");
		var c3 = new Customer("MAX", "Cincinnati", "OH");

		try {
			// Have to keep doing db.add since the memory is wiped after stopping program
			db.add(c1);
			db.add(c2);
			db.add(c3);
			
			db.delete(c2.getId());
			
			var customers = db.getAll();
			for(var c : customers) {
				c.log();
			}
			
			//var max = db.getByPk(3);
			//max.log();
			//db.get(1).log();
			
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}
