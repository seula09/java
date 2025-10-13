package cote.exam1013;

import java.util.Scanner;

public class OrderExample {

	public static void main(String[] args) {
		Menu[] menus = new Menu[3];
		menus[0] = new Menu("아메리카노", 2000);
		menus[1] = new Menu("카페라떼", 3000);
		menus[2] = new Menu("티", 2500);
		
		Scanner sc = new Scanner(System.in);
		
		int orderIndex = sc.nextInt();
		int quantity = sc.nextInt();
		sc.close();
		
		if(orderIndex >= 0 && orderIndex < menus.length && quantity > 0) {
			OrderItem item = new OrderItem(menus[1], 3);
			System.out.println(item.getPrice());
		}

	}

}
