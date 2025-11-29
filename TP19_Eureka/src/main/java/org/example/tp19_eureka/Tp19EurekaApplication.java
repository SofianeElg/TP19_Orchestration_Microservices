package org.example.tp19_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Tp19EurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp19EurekaApplication.class, args);
	}

}
