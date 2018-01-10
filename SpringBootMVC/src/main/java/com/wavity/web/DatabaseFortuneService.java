package com.wavity.web;

import org.springframework.stereotype.Component;



public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "DB Fortune accepted";
	}

}
