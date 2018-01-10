package com.wavity.web;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.wavity.web")
@PropertySource("classpath:sport.properties")
public class SportConfig {

	//define bean for database fortune services
	@Bean
	public FortuneService databaseFortuneService(){
		return new DatabaseFortuneService();
	}
	
	
	//define bean for   and inject dependency
	@Bean
	public FortuneService randomFortuneService(){
		return new RandomFortuneService();
	}

	@Bean
	public FortuneService happyFortuneService(){
		return new HappyFortuneService();
	}
	
	
	@Bean
	public FortuneService rESTFortuneService(){
		return new RESTFortuneService();
	}
	
	@PostConstruct
    public void doMyStartupStuff() {
        System.out.println(" TennisCoach: inside of doMyStartupStuff()");
    }
    
    // define my destroy method
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println(" TennisCoach: inside of doMyCleanupStuff()");
    }
}

