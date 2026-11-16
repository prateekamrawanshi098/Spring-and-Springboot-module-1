package in.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.spring.beans.Programmer;

public class UseProgrammer {
	
	
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("/in/spring/resources/beanconfig.xml");
		Programmer p1 = (Programmer) container.getBean("prg1");
		System.out.println("Name of pragrammner "+p1.getName());
		p1.writeCode();
		
		Programmer p2 = (Programmer) container.getBean("prg2");
		System.out.println("Name of pragrammner "+p2.getName());
		p2.writeCode();
	}
}
