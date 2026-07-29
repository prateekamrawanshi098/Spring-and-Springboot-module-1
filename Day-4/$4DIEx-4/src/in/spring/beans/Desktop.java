package in.spring.beans;

public class Desktop implements Computer{
	public Desktop(String brand) {
		System.out.println("Desktop created of " + brand);
	}

	public boolean start() {

		System.out.println("Desktop started");
		return true;
	}
}
