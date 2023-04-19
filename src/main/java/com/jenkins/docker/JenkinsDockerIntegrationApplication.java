package com.jenkins.docker;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDockerIntegrationApplication {

	private static Logger logger  = LoggerFactory.getLogger(JenkinsDockerIntegrationApplication.class);
	
	public static void main(String[] args) {
		
		logger.info("This is logger ");
		SpringApplication.run(JenkinsDockerIntegrationApplication.class, args);
	}

}
