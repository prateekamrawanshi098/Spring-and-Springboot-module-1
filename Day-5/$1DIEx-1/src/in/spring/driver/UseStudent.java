package in.spring.driver;

import in.spring.beans.Bike;
import in.spring.beans.Bus;
import in.spring.beans.Car;
import in.spring.beans.Student;

public class UseStudent {
	public static void main(String[] args)

	{
		Bus bus = new Bus();
		Student s1 = new Student(bus);
		s1.goToCollege();
		
		Car car=new Car();
		Student s2=new Student(car);
		s2.goToCollege();
		
		Bike bike=new Bike();
		Student s3=new Student(bike);
		s3.goToCollege();
	}
}