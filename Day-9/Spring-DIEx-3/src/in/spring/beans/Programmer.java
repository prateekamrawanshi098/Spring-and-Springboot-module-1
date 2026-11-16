package in.spring.beans;

public class Programmer  {
	
	private String name;
	private Laptop lp;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Programmer name injected .");
		this.name = name;
	}

	public Laptop getLp() {
		return lp;
	}

	public void setLp(Laptop lp) {
		System.out.println("Programme lp injected .");
		this.lp = lp;
	}

	public Programmer() {
		System.out.println("Programmer bean created ......");		
	}

	public void writeCode() {
		boolean result = lp.startLaptop();
		if (result) {
			System.out.println("Coding started");

		} else {
			System.out.println("Coding not started");
		}

	}
}
