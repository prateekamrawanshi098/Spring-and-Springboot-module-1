package in.spring.beans;

public class Desktop implements Computer{

	public Desktop() {
		System.out.println("Desktop bean created ....");	
	}

	@Override
	public boolean start() {
		System.out.println("Desktop Started");
		return true;
	}
	
	
}
