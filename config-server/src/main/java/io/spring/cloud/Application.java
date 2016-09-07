package io.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@EnableConfigServer
@EnableEurekaClient
@RestController
public class Application {
	
	@RequestMapping("/status")
	public String status() {
		return "Service is up and running...";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
}