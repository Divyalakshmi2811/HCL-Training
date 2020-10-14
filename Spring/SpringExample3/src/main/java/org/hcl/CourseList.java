package org.hcl;

import java.util.ArrayList;

public class CourseList {
	ArrayList<Course> courseList=new ArrayList();
	public void insert(Course course)
	{
		courseList.add(course);
	}
	public ArrayList<String> noOfcourse(Double budget)
	{
	
	ArrayList<String> list=new ArrayList<>();
	for(Course course:courseList)
	{
		if(budget>=course.getFee())
		{
			list.add(course.getName()+"_"+(int)(budget/course.getFee()));
		}
	}
	return list;


}
}
