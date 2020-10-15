package org.hcl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean(name="address1")
	public Address getAddress()
	{
		Address address = new Address();
		address.setLine1("2/115 Anna Nagar ");
		address.setLine2("Kaveripattinam ");
		address.setCity("Krishnagiri ");
		address.setPincode("635112 ");
		return address;
	}
		
	@Bean(name="employee1")
	public Employee getEmployee()
	{
		Employee employee=new Employee();
		employee.setEmployeeName("Sathish ");
		employee.setEmployeeMobileNumber(956634567);
		employee.setEmployeeSalary(45000);
		employee.setEmployeeEmail("me@gmail.com ");
		return employee;
		
	}

}
