package in.spring.beans;

public class Student {
	
	String name ;
	int roll;
	
	Student(int roll,String name){
		System.out.println("Student bean created");
		this.name=name;
		this.roll=roll;
	}	
	

	public void setName(String name) {
		this.name = name;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public String getName() {
		return name;
	}
	
	public int getRoll() {
		return roll;
	}

}
