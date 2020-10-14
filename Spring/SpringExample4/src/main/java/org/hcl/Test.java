package org.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		System.out.println("Total Revenue");
		CourseList courseList=new CourseList();
		Course c1=context.getBean("course1",Course.class);
		Course c2=context.getBean("course2",Course.class);
		Course c3=context.getBean("course3",Course.class);
		courseList.insert(c1);
		courseList.insert(c2);
		courseList.insert(c3);
		System.out.println(courseList.revenge());
	}

}
