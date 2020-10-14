package org.hcl;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring1.xml");
		Employee employee=context.getBean(Employee.class,"employee");
		employee.display();
		List<String> employeeMobileNumber1=employee.getEmployeeMobileNumber1();
		Address add=employee.getAddress();
		add.display();
		((ClassPathXmlApplicationContext)context).close();
		

	}

}
