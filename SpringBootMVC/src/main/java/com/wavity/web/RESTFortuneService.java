package com.wavity.web;

import org.springframework.stereotype.Component;


@Component
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "RestFortune has accepted";
	}

}
