package in.spring.beans;

public class Programmer extends LapTop {
	public void writeCode() {
		boolean result = super.startLapto();
		if (result) {
			System.out.println("Coding started");

		} else {
			System.out.println("Coding not started");
		}

	}
}
