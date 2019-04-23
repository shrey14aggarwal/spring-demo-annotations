package com.love2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	
	public String getFortune() {

		return "You are lucky today";
	}

}
