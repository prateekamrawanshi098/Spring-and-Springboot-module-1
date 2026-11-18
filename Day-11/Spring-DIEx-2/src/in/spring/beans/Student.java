package in.spring.beans;

public class Student {
	
	String name ;
	int roll;
	
	Student(int roll,String name){
		this.name=name;
		this.roll=roll;
	}	
	


	public String getName() {
		return name;
	}
	
	public int getRoll() {
		return roll;
	}

}
