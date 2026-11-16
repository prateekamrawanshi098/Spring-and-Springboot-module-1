package in.spring.beans;

public class Student {
	
	int roll;
	String name;
	
	Student(){
		System.out.println("Student Bean created");
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	
	
	
}
