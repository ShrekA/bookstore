package org.sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@EntityScan(value = "org.sun.entity")
@ServletComponentScan(value = "org.sun.cfg.cfg")
public class BookstoreWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreWebApplication.class, args);
	}
}
