package org.hcl;


import java.util.List;

public class Employee {
	private String employeeName;
	List<String> employeeMobileNumber1;
	private long employeeSalary;
	private String employeeEmail;
	private Address address;
	public Employee()
	{
		
	}
	public Employee(String employeeName, List<String> employeeMobileNumber1, long employeeSalary, String employeeEmail,
			Address address) {
		super();
		this.employeeName = employeeName;
		this.employeeMobileNumber1 = employeeMobileNumber1;
		this.employeeSalary = employeeSalary;
		this.employeeEmail = employeeEmail;
		this.address = address;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public List<String> getEmployeeMobileNumber1() {
		return employeeMobileNumber1;
	}
	public void setEmployeeMobileNumber1(List<String> employeeMobileNumber1) {
		this.employeeMobileNumber1 = employeeMobileNumber1;
	}
	public long getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(long employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void display()
	{
		System.out.println("Name:"+getEmployeeName());
		System.out.println("The contact numbers are:");
		
		for(String employeeMobileNum:employeeMobileNumber1)
		{
			System.out.println(employeeMobileNum);
		}
		System.out.println(getEmployeeSalary());
		System.out.println(getEmployeeEmail());
	}
	
	
}