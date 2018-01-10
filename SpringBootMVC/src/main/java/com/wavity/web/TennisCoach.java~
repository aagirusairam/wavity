package com.wavity.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}") 
	private String team;
	
	@Autowired
	public TennisCoach( @Qualifier("rESTFortuneService") FortuneService theFortuneService){
	    System.out.println("TennisCoach: inside constructor using @autowired and @qualifier");
	    fortuneService = theFortuneService;
	}
	 
	@RequestMapping("/email")
	public String getEmail() {
		return email;
	}
	@RequestMapping("/team") s
	public String getTeam(){
		return team;
	}	 
	@Override
	public String getDailyWorkout(){
		return "Practice your backhand volley";
	}

	@Override
	@RequestMapping("/fortune")
	public String getDailyFortune() {
		return fortuneService.getFortune();	
		}
}
