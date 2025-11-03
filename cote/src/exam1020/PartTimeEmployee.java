package exam1020;

public class PartTimeEmployee extends Employee{
	
	private int hourRate;
	private int workHours;
	
	protected PartTimeEmployee(String name, String employeeId, int hourRate, int workHours) {
		super(name, employeeId);
		this.hourRate = hourRate;
		this.workHours = workHours;
	}
	
	
	public int getHourRate() {
		return hourRate;
	}

	public void setHourRate(int hourRate) {
		this.hourRate = hourRate;
	}
	
	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}


	@Override
	public int calculatePay() {
		return hourRate*workHours;
	}




}
