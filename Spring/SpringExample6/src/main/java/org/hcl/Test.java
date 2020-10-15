package org.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		Course course1=context.getBean("c1",Course.class);
		System.out.println("Course:"+course1.getName());
		System.out.println("SME by"+"\t"+course1.getMentor());
		System.out.println("Fee:"+course1.getFee());
		
		Course course2=context.getBean("c2",Course.class);
		System.out.println("Course:"+course2.getName());
		System.out.println("SME by"+"\t"+course2.getMentor());
		System.out.println("Fee:"+course2.getFee());
		
		Course course3=context.getBean("c3",Course.class);
		System.out.println("Course:"+course3.getName());
		System.out.println("SME by"+"\t"+course3.getMentor());
		System.out.println("Fee:"+course3.getFee());
		
		((ClassPathXmlApplicationContext)context).close();
		
		
		

	}

}

