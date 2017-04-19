package org.sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(value = "org.sun.entity")
@ServletComponentScan(value = "org.sun.cfg.db")
public class BookstoreBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreBookApplication.class, args);
	}
}
