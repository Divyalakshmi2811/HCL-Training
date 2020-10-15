package org.hcl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
@Component
public class Box {
	private int length;
	private int width;
	private User user;
	public Box()
	{
		
	}
	public Box(int length, int width, User user) {
		super();
		this.length = length;
		this.width = width;
		this.user = user;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public User getUser() {
		return user;
	}
	@Autowired
	@Qualifier("user1")
	@Required
	public void setUser(User user) {
		this.user = user;
	}
	
	public void display()
	{
		System.out.println("The hall of length"+"\t"+length+"\t"+"and width"+"\t"+width+"is owned by"+"\t"+user.getName() );
	}
	
}
