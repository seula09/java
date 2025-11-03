package exam1020;

public class Tire {
	protected String name;
	protected int maxRotation;
	protected int currentRotation;
	
	public Tire(String name, int Max, int Rpm) {
		this.name = name;
		this.maxRotation = maxRotation;
		this.currentRotation = 0;
	}
	
	public boolean roll() {
		if(currentRotation >= maxRotation) {
			return false;
		}
		else {
			currentRotation +=1;
			return true;
		}
	}
}
