package in.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.spring.beans.Programmer;

public class UseProgrammer {
	
	
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("/in/spring/resources/beanconfig.xml");
		Programmer p = (Programmer) container.getBean("prg");
		System.out.println("Name of pragrammner "+p.getName());
		System.out.println("Laptop brand is "+p.getLp().getBrand());
		p.writeCode();
	}
}
