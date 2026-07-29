package in.spring.beans;

public class Programmer {
	private LapTop lp = new LapTop();

	public void writeCode() {
		boolean result = lp.startLapto();
		if (result) {
			System.out.println("Coding started");

		} else {
			System.out.println("Coding not started");
		}

	}
}
