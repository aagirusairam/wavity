package com.wavity;

import javax.servlet.Filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public Filter securityFilter() {
    	SecurityFilter sf= new SecurityFilter();
        return sf;
    }
}

