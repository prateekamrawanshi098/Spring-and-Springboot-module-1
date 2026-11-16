package in.spring.beans;

public class Laptop {
	
	
private String brand;


	
	public Laptop() {
		System.out.println("laptop bean created ...");
	}


	public void setBrand(String brand) {
		this.brand=brand;
		System.out.println("laptop brand injected");
	}
	
	
	
	public Laptop(String brand) {
		super();
		this.brand = brand;
	}

	public boolean startLaptop() {
		System.out.println("laptop started");
		return true;
	}


	public String getBrand() {
		return brand;
	}
	
	
	
}
