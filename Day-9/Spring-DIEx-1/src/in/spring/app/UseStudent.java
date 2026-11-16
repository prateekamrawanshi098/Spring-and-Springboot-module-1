package in.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.spring.beans.Student;

public class UseStudent {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("in/spring/resources/beanconfig.xml");
		Student s1= container.getBean("std1",Student.class);
	    System.out.println("name of student 1 : "+s1.getName());
	    System.out.println("roll of student 1 : "+s1.getRoll());
	    
	    Student s2= container.getBean("std2",Student.class);
	    System.out.println("name of student 2 : "+s2.getName());
	    System.out.println("roll of student 2 : "+s2.getRoll());
	}
}
