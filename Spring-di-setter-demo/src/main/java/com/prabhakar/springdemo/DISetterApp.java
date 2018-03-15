package com.prabhakar.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prabhakar.springdemo.domain.Organization;


public class DISetterApp {
	
	public static void main(String[] args) {
		// create application context container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		// create bean
		Organization org = (Organization)ctx.getBean("myorg");
		
		//invoking the company slogan via the bean
		System.out.println(org.corporateSlogan());
		
		//Print organization details
		System.out.println(org);
		
		//Print organization service
		System.out.println(org.corporateService());
		
		//close the application context ((container))
		((ClassPathXmlApplicationContext)ctx).close();
		
	}
	
	
	
}
