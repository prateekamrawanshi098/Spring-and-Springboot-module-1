package in.spring.beans;

public class Student {
	Vehicle v;

	public void setVehicle(Vehicle v) {
		this.v=v;
	}
	
	public void goToCollege() {
		System.out.println("Going to college");
		v.travel();
	}
}
