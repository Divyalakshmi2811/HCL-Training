package org.hcl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws NumberFormatException, IOException {
		CourseList courselist=new CourseList();
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> budgetlist=new ArrayList<>();
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		Course c1=context.getBean("course1",Course.class);
		Course c2=context.getBean("course2",Course.class);
		Course c3=context.getBean("course3",Course.class);
		System.out.println("Enter your budget");
		Double budget=Double.parseDouble(reader.readLine());
		courselist.insert(c1);
		courselist.insert(c2);
		courselist.insert(c3);
		budgetlist=courselist.noOfcourse(budget);
		if(budgetlist.isEmpty())
		{
			System.out.println("No courses available");
		}
		else
		{
			for(String values:budgetlist)
			{
				System.out.println(values);
			}
		}
		((ClassPathXmlApplicationContext)context).close();
		
		
		
		
		
		
		
		
	}

}
