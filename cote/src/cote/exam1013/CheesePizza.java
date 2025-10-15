package cote.exam1013;

public class CheesePizza extends Pizza{
	public CheesePizza() {size = "m";}
	public CheesePizza(String size) {
		this.size = size;
		this.name="치즈피자";
		this.prices = new int[] {10000,15000,25000};
	}

}
