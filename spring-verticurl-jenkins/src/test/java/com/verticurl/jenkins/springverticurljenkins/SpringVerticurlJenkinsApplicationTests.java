package com.verticurl.jenkins.springverticurljenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringVerticurlJenkinsApplicationTests {
	public static Logger logger= LoggerFactory.getLogger(SpringApplication.class);
	@Test
	void contextLoads() {

		logger.info("Testcase executing....");
		logger.info("Testcase executing second log statement");
	}

}
