package org.sun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.sun.mapper")
//@EnableEurekaClient
public class BookstoreServiceOrgApplication {
	public static void main(String[] args) {
		SpringApplication.run(BookstoreServiceOrgApplication.class, args);
	}
}
