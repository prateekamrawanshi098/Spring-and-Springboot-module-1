package in.spring.beans;

public class Student {
	
	String name ;
	int roll;
	
	Student(String name){
		this.name=name;
	}	
	
	public Student(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}
	
	public int getRoll() {
		return roll;
	}

}
