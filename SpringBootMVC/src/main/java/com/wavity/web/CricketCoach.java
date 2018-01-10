package com.wavity.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CricketCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService") // field Injection
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String emailAddress;
	
	@Value("${foo.team}")
	private String team;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method-setEmailAddress");
			this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method-setTeam");
			this.team = team;
	}
	public CricketCoach(){
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	@Override
	@RequestMapping("/cricket")
	public String getDailyFortune() {
		return fortuneService.getFortune();	
		}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 Min";
	}

}
