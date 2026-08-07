package in.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.spring.beans.Student;

public class UseStudent {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("in/spring/resources/beanconfig.xml");
		Student s = (Student) container.getBean(Student.class);
		System.out.println("Name : " + s.getName());
		System.out.println("ID : " + s.getRoll());

	}
}
