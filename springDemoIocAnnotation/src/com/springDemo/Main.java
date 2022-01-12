package com.springDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
	     AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(IocConfig.class);
		//CustomerManager customerManager = new CustomerManager(context.getBean("database",ICustomerDal.class));
		ICustomerService customerService = context.getBean("service",ICustomerService.class);
			customerService.add(); 
		
	

	}

}
