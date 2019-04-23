package com.love2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
    //Get the bean configuration java class
	AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SportConfig.class);
		
	//Get the beans
	SwimCoach thecoach= context.getBean("swimCoach", SwimCoach.class);
	
	//call the functions
	System.out.println(thecoach.getDailyWorkout());
	
	System.out.println(thecoach.getDailyFortune());
	
	System.out.println("email : "+thecoach.getEmail());
	
	System.out.println("team : "+thecoach.getTeam());
	
	//close the context
	context.close();
		
		
	}

}
