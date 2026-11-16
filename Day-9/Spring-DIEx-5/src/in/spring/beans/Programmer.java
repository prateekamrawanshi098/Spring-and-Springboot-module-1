package in.spring.beans;

public class Programmer  {
	
	private String name;
	private Computer cp;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Programmer name injected .");
		this.name = name;
	}

	public Computer getCp() {
		return cp;
	}

	public void setCp(Computer cp) {
		System.out.println("Computer injected...");
		this.cp = cp;
	}

	public Programmer() {
		System.out.println("Programmer bean created ......");		
	}

	public void writeCode() {
		boolean result = cp.start();
		if (result) {
			System.out.println("Coding started");

		} else {
			System.out.println("Coding not started");
		}

	}
}
