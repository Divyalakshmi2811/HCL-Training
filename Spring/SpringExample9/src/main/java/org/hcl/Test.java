package org.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context =new AnnotationConfigApplicationContext(Config.class);
		Box box=context.getBean("box1",Box.class);
		box.display();

	}

}
