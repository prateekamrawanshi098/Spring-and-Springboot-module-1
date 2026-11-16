package in.spring.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.spring.beans.Programmer;

public class UsePragrammer {
	
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("/in/spring/resources/beanconfig.xml");
		Programmer p1 = (Programmer) container.getBean("prg1");
		System.out.println("Name of pragrammner "+p1.getName());
		System.out.println("Laptop brand is "+p1.getLp().getBrand());
		p1.writeCode();
		
	}
}
