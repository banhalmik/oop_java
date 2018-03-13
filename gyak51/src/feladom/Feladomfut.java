package feladom;

public class Feladomfut {
	public static void main(String[] args) {
		Feladom a = new Feladom(2, 5);
		Feladom b = new Feladom(3, 7);
		Feladom c = a;
		
		System.out.println(a.getAdatok());
		System.out.println(b.getAdatok());
		System.out.println(c.getAdatok());
		
		System.out.println("");
		
		a.setOldalak(4, 10);
		System.out.println(a.getAdatok());
		System.out.println(b.getAdatok());
		System.out.println(c.getAdatok());
		
		System.out.println("");
		
		a.setOldalak(3, 7);
		System.out.println("Az a==b: " + (a==b));
		System.out.println("Az a==c: " + (a==c));
		
		System.out.println("");
		
		System.out.println("Az a==b metódussal: " + (a.getOldalakEgyeznekE(b)));
	}

}
