package org.hcl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Config {
	@Bean(name="user1")
	public User getUser()
	{
		User user=new User();
		user.setName("Surya");
		user.setPassword("Surya");
		return user;
	}
	@Bean(name="box1")
	public Box getBox()
	{
		Box box=new Box();
		box.setLength(10);
		box.setWidth(12);
		return box;
	}
}
