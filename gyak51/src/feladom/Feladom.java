package feladom;

public class Feladom {
	private int a;
	private int b;

	// konstruktor neve osztály nevével megegyezik
	public Feladom(int aIn, int bIn) {
		a = aIn;
		b = bIn;
	}

	public Feladom(int sideIn) {
		a = sideIn;
		b = sideIn;
	}

	public int getTerulet() {
		return a * b;
	}

	public String getAdatok() {
		return "A oldal: " + a + " B oldal: " + b + " Terulet:" + getTerulet();
	}

	public void setOldalak(int aIn, int bIn) {
		a = aIn;
		b = bIn;
	}

	public void setOldal(int sideIn) {
		a = sideIn;
		b = sideIn;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}
	
	public boolean getTerulet(Feladom other) {
		if(getTerulet() > other.getTerulet())
			return true;
		return false;
	}
	
	public boolean getOldalakEgyeznekE(Feladom other) {
		if (a == other.a && b == other.b)
			return true;
	
		return false;
	}

}
