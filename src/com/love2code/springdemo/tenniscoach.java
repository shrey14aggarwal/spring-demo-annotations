package com.love2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class tenniscoach implements coach {
	
	//@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	public tenniscoach(){
		
		System.out.println(">>>>> This is tennis coach constructor <<<<<");
	}
	
	
	//this is constructor based injection 
	//we cannot use @Qualifier annotation here
	/*@Autowired
	public tenniscoach(FortuneService fortuneService)
	{
		this.fortuneService=fortuneService;
	}*/

	public String getDailyWorkout() {

		return "Practice your tennis sessions";	
		
	}

	//this is setter based injection
/*	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/

	public String getDailyFortune() {
            
		return (fortuneService.getFortune());
	}
	
	

}
