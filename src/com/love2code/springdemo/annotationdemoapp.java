package com.love2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class annotationdemoapp {

	public static void main(String[] args) {
    //Get the bean configuration file
	ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
	//Get the beans
	coach thecoach= context.getBean("tenniscoach", coach.class);
	
	//call the functions
	System.out.println(thecoach.getDailyWorkout());
	
	System.out.println(thecoach.getDailyFortune());
	
	//close the context
	context.close();
		
		
	}

}
