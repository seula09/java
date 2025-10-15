package cote.exam1013;
import java.util.Scanner;

public class PizzaExample {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String size = sc.next();
		sc.close();
		
		Pizza pizza;
//		pizza = new pizza();
		
		if(name.equals("C")) { // C -> cheesePizza
			pizza = new CheesePizza(size);
		}else if(name.equals("S")){ 
			pizza = new ShrimpPizza(size);
		}else { //P or else -> PepperoniPizza
			pizza = new PepperoniPizza(size);
		}
		pizza.cook();
		pizza.serve();
				

	}

}
