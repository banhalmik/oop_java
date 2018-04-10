package sikidom;

public class Teglatest extends Hasab {
	private double a;
	private double b;
	
	public Teglatest(double a, double b, int height) {
		super(height);
		this.a = b;
		this.b = b;
	}
	
	@Override
	public double baseArea() {
		return a * b;
	}
	
	public String toString() {
		return "A t�glatest adatai: [a oldal:" + this.a + " b oldal:" + this.b + " magassag:" + super.getHeight() + " ";
	}

}
