package com.thuctapsamsung.Duan2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
/*nguyenban*/
@ComponentScan(basePackages = {"com.thuctapsamsung.Duan2"})
public class Duan2Application {

	public static void main(String[] args) {
		SpringApplication.run(Duan2Application.class, args);
	}

}

