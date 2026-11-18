package in.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.spring.beans.Student;

public class UseStudent {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/in/spring/resources/beanconfig.xml");
		System.out.println("Container started");
		Student s1=context.getBean(Student.class);
		Student s2=context.getBean(Student.class);
		System.out.println("s1 values");
		System.out.println("name : "+s1.getName());
		System.out.println("roll : "+s1.getRoll());
	
		System.out.println();
		System.out.println("s2 values");
		System.out.println("name : "+s2.getName());
		System.out.println("roll : "+s2.getRoll());
		
		
		s1.setName("Vinit");
		s2.setRoll(201);
		
		System.out.println("After Changing");
		
		System.out.println("s1 values");
		System.out.println("name : "+s1.getName());
		System.out.println("roll : "+s1.getRoll());
	
		System.out.println();
		System.out.println("s2 values");
		System.out.println("name : "+s2.getName());
		System.out.println("roll : "+s2.getRoll());
		
	}
}
