package com.love2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
    //Get the bean configuration java class
	AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SportConfig.class);
		
	//Get the beans
	coach thecoach= context.getBean("tenniscoach", coach.class);
	
	//call the functions
	System.out.println(thecoach.getDailyWorkout());
	
	System.out.println(thecoach.getDailyFortune());
	
	//close the context
	context.close();
		
		
	}

}
