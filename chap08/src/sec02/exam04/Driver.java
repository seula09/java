package sec02.exam04;

public class Driver {
	
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			//checkFare 함수는 Bus 타입에만 있음.
			bus.checkFare();
		}
		vehicle.run();
	}

}
