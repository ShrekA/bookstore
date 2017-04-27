package org.sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BookstoreServerHaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreServerHaApplication.class, args);
	}

}
