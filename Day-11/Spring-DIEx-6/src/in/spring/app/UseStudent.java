package in.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.spring.beans.Student;

public class UseStudent {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/in/spring/resources/beanconfig.xml");
		Student s1= context.getBean(Student.class);
		System.out.println("Name : "+s1.getName());
		System.out.println("Roll : "+s1.getRoll());
		
		Student s2= context.getBean(Student.class);
		System.out.println("Name : "+s2.getName());
		System.out.println("Roll : "+s2.getRoll());
		
		s1.setName("Ravi");
		s2.setRoll(101);
        System.out.println("After changes");
        
		System.out.println("Name : "+s1.getName());
		System.out.println("Roll : "+s1.getRoll());
		
		System.out.println("Name : "+s2.getName());
		System.out.println("Roll : "+s2.getRoll());
	}
}
