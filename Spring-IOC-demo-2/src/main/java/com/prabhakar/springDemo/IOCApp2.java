package com.prabhakar.springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class IOCApp2 {
	
	public static void main(String[] args) {
		// create application context container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		// create bean
		Organization org = (Organization)ctx.getBean("myorg");
		
		//invoking the company slogan via the bean
		org.corporateSlogan();
		
		//close the application context ((container))
		((ClassPathXmlApplicationContext)ctx).close();
		
	}
	
	
	
}
