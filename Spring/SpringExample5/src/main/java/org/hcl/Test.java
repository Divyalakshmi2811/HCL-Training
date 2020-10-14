package org.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		
		CourseList courselist=new CourseList();
		Course c1=context.getBean("course1",Course.class);
		Course c2=context.getBean("course2",Course.class);
		Course c3=context.getBean("course3",Course.class);
		courselist.insert(c1);
		courselist.insert(c2);
		courselist.insert(c3);
		courselist.discount();
		((ClassPathXmlApplicationContext)context).close();

	}

}
