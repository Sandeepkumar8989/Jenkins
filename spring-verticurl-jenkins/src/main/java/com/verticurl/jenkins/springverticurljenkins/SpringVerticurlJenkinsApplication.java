package com.verticurl.jenkins.springverticurljenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringVerticurlJenkinsApplication {

	public static Logger logger= LoggerFactory.getLogger(SpringApplication.class);
	public void init(){
		logger.info("Application Started");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringVerticurlJenkinsApplication.class, args);

		System.out.println("Welcome to Verticurl FLT Program");
	}

}
