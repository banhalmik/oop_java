package sikidom;

import sikidom.Henger;

public class sikidomFut {
	public static void main(String[] args) {
		Henger h1 = new Henger(5, 10);
		
		System.out.println(h1.toString());
		System.out.println("a h1 terfogata: " + h1.getVolume());
		
		System.out.println("");
		Teglatest t1 = new Teglatest(5, 10, 5);
		System.out.println(t1.toString());
		System.out.println("a t1 terfogata: " + t1.getVolume());
	}

}
