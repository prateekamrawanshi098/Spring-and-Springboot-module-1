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
		
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

	}
}
