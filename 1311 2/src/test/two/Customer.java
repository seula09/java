package test.two;

public class Customer {
	public String name;
	public String phone;
	public int point; 
	
	public Customer(String name, String phone, int point) {
		this.name = name;
		this.phone = phone;
		this.point = 0;
	}
	
	public void Customer(String name, String phone, int point) {
		this.name = name;
		this.phone = phone;
		this.point = point;
	}
	
	int updatePoint(int amount) {
		point += amount;
		System.out.println(point);
		return amount;
	}
	
	int setpoint(int point) {
		point=point;
		System.out.println(point);
		return point;
	}


}
