package in.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.spring.beans.Customer;

public class UseApp {
	public static void main(String[] args) {
		
		ApplicationContext container =new ClassPathXmlApplicationContext("/in/spring/resources/beanconfig.xml");
		System.out.println("Conatiner started");
		Customer c=container.getBean(Customer.class);
		c.show();
	}

}
