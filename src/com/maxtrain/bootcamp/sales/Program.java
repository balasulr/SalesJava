package com.maxtrain.bootcamp.sales;

public class Program {

	public static void main(String[] args) {
		
		var p1 = new Product("ECHO", "Echo", 100);
		var p2 = new Product("ECHODOT", "Echo Dot", 50);
		var p3 = new Product("FIRETV", "Fire TV", 150);
		
		var pdb = new ProductDB();
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

		var db = new CustomerDb();
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
