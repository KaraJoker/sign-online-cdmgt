package com.huluwa.cdmgt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class CdmgtEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CdmgtEurekaApplication.class, args);
	}
}
