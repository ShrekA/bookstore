package org.sun;

import com.netflix.discovery.EurekaClient;
import com.netflix.eureka.EurekaServerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BookstoreWebApplication {
	public static void main(String[] args) {
		SpringApplication.run(BookstoreWebApplication.class, args);
	}
}
