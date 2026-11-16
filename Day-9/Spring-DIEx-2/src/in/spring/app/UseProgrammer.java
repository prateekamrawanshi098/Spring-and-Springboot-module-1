package in.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.spring.beans.Laptop;
import in.spring.beans.Programmer;

public class UseProgrammer {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("in/spring/resources/beanconfig.xml");
		Laptop l1= container.getBean("lp",Laptop.class);
	    System.out.println("name of student 1 : "+l1.getBrand());
	    
	    Programmer p1= container.getBean("prg",Programmer.class);
	    System.out.println("name of student 2 : "+p1.getName());
	}
}
