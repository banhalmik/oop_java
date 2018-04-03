package myproductsrun;

/* import myproducts.Bread;
import myproducts.Product; */

import myproducts.*;

public class ProductRun {
	
	public static void main(String[] args) {
		product p1 = new product("product1", 100, 27);
		Bread b1 = new Bread("Bread1", 200, 27, 2);
		
		System.out.println("A p1 adatai: " + p1.toString());
		System.out.println("A b1 adatai: " + b1.toString());
		
		int priceCompare = p1.productCompare(b1);
		if(priceCompare == 1)
			System.out.println("A p1 ára nagyobb.");
		else if(priceCompare == -1)
			System.out.println("A b1 ára nagyobb.");
		else
			System.out.println("A p1 és b1 ára megegyezik.");
		
		System.out.println("");
		
		Bread b2 = new Bread("Bread2", 150, 20, 3);
		product product2 = b2;
		
		System.out.println("A product2 adatai: " + product2.toString());
		
		Bread bread2 = new Bread("bread2", 200, 20, 3);
		Bread.BreadPriceCompare((Bread)product2, bread2);
		
		boolean res = Bread.BreadPriceCompare((Bread) product2, bread2);
	}

}
