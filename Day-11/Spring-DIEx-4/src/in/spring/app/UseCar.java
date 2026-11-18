package in.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.spring.beans.Car;

public class UseCar {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("/in/spring/resources/beanconfig2.xml");
		Car c= container.getBean(Car.class);
		c.drive();
	}
}
