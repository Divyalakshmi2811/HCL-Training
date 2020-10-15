package org.hcl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean(name="order1")
	public Order getOrder()
	{
		Order order=new Order();
		order.setItemName("item1");
		order.setPrice(230.07);
		return order;
	}
	@Bean(name="order2")
	public Order getOrder1()
	{
		Order order=new Order();
		order.setItemName("item2");
		order.setPrice(230.07);
		return order;
	}
	@Bean(name="user")
	public User getUser()
	{
		User user=new User();
		user.setName("Jegan");
		user.setAge(24);
		user.setCity("Chennai");
		return user;
	}
}
