package com.wavity.web;

import org.springframework.stereotype.Component;


public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is Lucky Day!";
	}

}
