package in.spring.beans;

public class Programmer {
	private LapTop lp = new LapTop("Dell");

	public void writeCode() {
		boolean result = lp.startLaptop();
		if (result) {
			System.out.println("Coding started");

		} else {
			System.out.println("Coding not started");
		}

	}
}
