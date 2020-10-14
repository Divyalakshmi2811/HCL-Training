package org.hcl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Configuration
public class OwnerConfig {
	@Bean(name="o")
	public Owner setDetails()
	{
		Owner o=new Owner();
		o.setName("Adhithya ");
		o.setPassword("adhikg1234 ");
		o.setMobileNumber("9789097806");
		return o;
	}
	 

}
