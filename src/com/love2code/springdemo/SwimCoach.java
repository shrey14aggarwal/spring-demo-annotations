package com.love2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements coach {
	
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	

	public SwimCoach(FortuneService fortuneService )
	{	
		this.fortuneService=fortuneService;
	}
	
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}


	public String getDailyWorkout() {

		return "Swim 1000 metres as a warmup";
	}

	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
