package in.spring.beans;

public class Student {
	
	String name ;
	int roll;
	Address addr;
	
	Student(int roll,String name,Address addr){
		System.out.println("Student bean created");
		this.name=name;
		this.roll=roll;
	    this.addr=addr;
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


	public Address getAddr() {
		return addr;
	}


	public void setAddr(Address addr) {
		this.addr = addr;
	}

}
