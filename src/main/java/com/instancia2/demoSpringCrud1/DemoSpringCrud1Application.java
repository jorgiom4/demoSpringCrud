package com.instancia2.demoSpringCrud1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class DemoSpringCrud1Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringCrud1Application.class, args);
	}
}
