package com.wavity.web;

import java.util.Random;

import org.springframework.stereotype.Component;


 // @Component
public class RandomFortuneService implements FortuneService {
	
	// array of strings
	private String[] data= {
			"beware of the wolf in sheep's clothing",
			"Diligence is mother of good luck",
			"The Journey is the reward"
	};
			// Random number generator
	private  Random myRandom= new Random();

	@Override
	public String getFortune() {
		int index= myRandom.nextInt(data.length);
		String theFortune= data[index];
		return theFortune;
	}

}
