package in.spring.beans;

public class Student {
	private int roll;
	private String name;

	public Student() {
		System.out.println("Student bean created ...");
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int id) {
		System.out.println("id injected ...");
		this.roll = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("name injected ...");
		this.name = name;
	}

}
