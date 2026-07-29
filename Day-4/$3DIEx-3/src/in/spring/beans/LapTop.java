package in.spring.beans;

public class LapTop {
	LapTop(String brand) {
		System.out.println("LapTop created of " + brand);
	}

	public boolean startLaptop() {

		System.out.println("laptop started");
		return true;
	}
}
