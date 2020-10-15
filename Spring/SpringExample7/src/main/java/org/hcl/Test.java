package org.hcl;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Employee employee=context.getBean(Employee.class,"employee1");
		employee.display();
		
		Address address=context.getBean(Address.class,"address1");
		address.display();
		((AnnotationConfigApplicationContext)context).close();

	}

}
