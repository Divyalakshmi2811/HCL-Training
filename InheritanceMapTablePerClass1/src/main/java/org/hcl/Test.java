package org.hcl;

import org.hcl.BatsMan;
import org.hcl.Bowler;
import org.hcl.Person;
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
		Person person=new Person();
		
		person.setFirstName("Ravi");
		person.setLastName("Shastri");
		
		Integer id=(Integer)session.save(person);
		transaction.commit();
		System.out.println(id);
		session.close();
	}

}

