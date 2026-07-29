package in.spring.beans;

public class Programmer {
	Computer cmp;
	public Programmer(Computer cmp) {
		 this.cmp=cmp; 
	}

	public void writeCode() {
		boolean result = cmp.start();
		if (result) {
			System.out.println("Coding started");

		} else {
			System.out.println("Coding not started");
		}

	}

	
}
