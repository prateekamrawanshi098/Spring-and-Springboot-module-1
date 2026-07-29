package in.spring.driver;

import in.spring.beans.Programmer;

public class UseProgrammer {
	public static void main(String[] args) {
		Programmer p1 = new Programmer();
		p1.writeCode();
		Programmer p2 = new Programmer();
		p2.writeCode();
	}
}
