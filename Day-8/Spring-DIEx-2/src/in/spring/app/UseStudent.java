package in.spring.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import in.spring.beans.Student;

public class UseStudent {
	public static void main(String[] args) {
		Resource res = new ClassPathResource("in/spring/resources/beanconfig.xml");
		BeanFactory container = new XmlBeanFactory(res);
		Student s=(Student) container.getBean(Student.class);
		System.out.println("Name : "+s.getName());
		System.out.println("ID : "+s.getRoll());

	}
}
