package com.Udemy.SpringCoreDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(
//		scanBasePackages = {"com.Udemy.Util.", "com.Udemy.SpringCoreDemo"}
//)

@SpringBootApplication
public class SpringCoreDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDemoApplication.class, args);
	}

}
