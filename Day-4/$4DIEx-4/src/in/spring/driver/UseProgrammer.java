package in.spring.driver;

import in.spring.beans.Desktop;

import in.spring.beans.LapTop;
import in.spring.beans.Programmer;

public class UseProgrammer {
	public static void main(String[] args) {
		LapTop l1=new LapTop("Dell");
		Programmer p1=new Programmer(l1);
		p1.writeCode();
		Desktop d1=new Desktop("Linux");
		Programmer p2 = new Programmer(d1);
		p2.writeCode();
	}
}
