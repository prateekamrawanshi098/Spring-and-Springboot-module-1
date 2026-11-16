package in.spring.beans;

public class Programmer  {
	
	private String name;
	private Laptop lp;

	public Programmer(Laptop lp) {
		System.out.println("Programme laptop injected using constructor.");
		this.lp = lp;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Programmer name injected using setter.");
		this.name = name;
	}

	public Laptop getLp() {
		return lp;
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
