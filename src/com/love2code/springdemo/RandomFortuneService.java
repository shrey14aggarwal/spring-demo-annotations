package com.love2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//Array of Strings 
	private String[] data={"hey my name is shrey",
						   " I study in Germany",
						   "My UNI name is UPB"};
	
	Random myRandom= new Random();

	public String getFortune() {
		final int index= myRandom.nextInt(data.length);
		String theFortune=data[index];
		return theFortune;
	}

}
