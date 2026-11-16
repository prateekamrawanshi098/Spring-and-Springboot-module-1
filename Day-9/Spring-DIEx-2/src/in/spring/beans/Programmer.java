package in.spring.beans;

public class Programmer {
	
	private String name;

	public Programmer() {
		System.out.println("Programmer bean created ...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("programmer name injected");
		this.name = name;
	}
	
	

}
