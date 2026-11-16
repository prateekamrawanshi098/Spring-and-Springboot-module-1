package in.spring.beans;

public class Laptop {
	
	private String brand;

	public Laptop() {
		System.out.println("Laptop bean created ........ ");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		System.out.println("Laptop brand injected");
		this.brand = brand;
	}
	

}
