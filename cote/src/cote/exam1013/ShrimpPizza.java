package cote.exam1013;

public class ShrimpPizza extends Pizza{
	
	public ShrimpPizza() {this("m");}
	public ShrimpPizza(String size) {
		this.size = size;
		this.name="슈림프피자";
		this.prices = new int[] {23000,27000,32000};
		this.toppings = "Shrimp";
	}
	
	@Override
	public void cook() {
		System.out.println(toppings+"을 추가합니다");
		super.cook();
	}

}
