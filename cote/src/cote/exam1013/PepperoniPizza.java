package cote.exam1013;

public class PepperoniPizza extends Pizza{
	
	public PepperoniPizza() {this("m");}
	public PepperoniPizza(String size) {
		this.size = size;
		this.name="치즈피자";
		this.prices = new int[] {12000,17000,20000};
		this.toppings = "pepperoni";
	}
	
	@Override
	public void cook() {
		System.out.println(toppings+"을 추가합니다");
		super.cook();
	}
			

}
