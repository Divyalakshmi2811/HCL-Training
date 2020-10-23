

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
	Transaction tx=session.beginTransaction();
	Hcl e=new Hcl();
	e.setEno(1);
	e.setName("bkd");
	e.setAddress("hyd");
	session.save(e);
	tx.commit();
	session.close();
	factory.close();

	

	}

}
