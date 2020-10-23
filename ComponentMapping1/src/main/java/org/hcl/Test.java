package org.hcl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		  Address address=new Address(101, "gandhi Street", "Chennai"); 
		  Employee employee=new Employee(); 
		  employee.setEno(1); 
		  employee.setName("suresh");
		  employee.setSal(100000); 
		  employee.setAddress(address); 
		  Integer id=(Integer)session.save(employee);
		  transaction.commit();
		  session.close();
		  factory.close();
		 
		/*
		 * Employee emp=session.get(Employee.class, 1); Address
		 * address=emp.getAddress();
		 * System.out.println(emp.getEno()+"\t"+emp.getSal()+"\t"+emp.getName());
		 * System.out.println(address.getHno()+"\t"+address.getLoc());
		 * transaction.commit();
		 */
		/*
		 * Employee emp=session.get(Employee.class, 1); session.remove(emp);
		 * transaction.commit(); session.close();
		 */
		
	}

}
