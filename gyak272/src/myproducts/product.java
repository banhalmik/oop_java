package myproducts;

public class product {
	private String name;
	private int netPrice;
	private int percentage;
	
	public product(String name, int netPrice, int percentage){
		this.name = name;
		this.netPrice = netPrice;
		this.percentage = percentage;
		
	}
	
	public int getGrossPrice() {
		return this.netPrice + (netPrice * (int) (this.percentage / 100));
	}
	
	public String toString() {
		return "Nev: " + this.name + " Brutto ar : " + getGrossPrice();
	}
	
	public void netPriceIncrease(int percentage) {
		this.netPrice = this.netPrice + (this.percentage * (percentage/100));
	}
	
	public int productCompare(product other) {
		if (this.getGrossPrice() > other.getGrossPrice())
			return 1;
		else if (this.getGrossPrice() < other.getGrossPrice())
			return -1;
		else
			return 0;
	}

}
