package org.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(OwnerConfig.class);
		Owner o=context.getBean(Owner.class,"o");
		System.out.println("Enter the name,password and mobile number of the user ");
		o.display();
		
		((AnnotationConfigApplicationContext)context).close();

	}

}
