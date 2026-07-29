package in.spring.beans;

public class LapTop implements Computer{
	public LapTop(String brand) {
		System.out.println("LapTop created of " + brand);
	}

	public boolean start() {

		System.out.println("laptop started");
		return true;
	}
}
