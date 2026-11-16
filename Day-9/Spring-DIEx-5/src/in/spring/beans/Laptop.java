package in.spring.beans;

public class Laptop implements Computer{
	
	
	public Laptop() {
		System.out.println("laptop bean created ...");
	}



	public boolean start() {
		System.out.println("laptop started");
		return true;
	}



	
	
}
