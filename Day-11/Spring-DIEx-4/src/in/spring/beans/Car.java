package in.spring.beans;

public class Car {
	
	private Engine en;
	private MusicPlayer mp;
	
	public Car(Engine en) {
		this.en=en;
	}

	public void setMs(MusicPlayer mp) {
		this.mp=mp;
	}
	
	public void drive() {
		en.start();
		System.out.println("Car is gettimg driver");
		if(mp!=null) {
			mp.play();
		}
		else {
			System.out.println("Car dont have music player");
		}
	}
	
}
