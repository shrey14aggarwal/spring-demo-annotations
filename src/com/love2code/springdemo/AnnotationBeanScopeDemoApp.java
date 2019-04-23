package com.love2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
 
		//Load the Bean Configuration File
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");

		//Retrieve the bean
		coach thecoach= context.getBean("tenniscoach",coach.class);
		coach alphacoach= context.getBean("tenniscoach",coach.class);
		
		//Call the methods
		boolean result= (thecoach==alphacoach);
		System.out.println("pointing to same location "+result);
		System.out.println(" Memory location of thecoach is "+thecoach);
		System.out.println(" Memory location of thecoach is "+alphacoach);
		
		//Close the context
		context.close();
	}

}
