package com.manning.readingList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// enables component-scanning and auto-configuration
@SpringBootApplication // this line is equal to listing the following 3 annotations: @Configuration @ComponentScan @EnableAutoConfiguration
public class ReadingListApplication {

	public static void main(String[] args) {
		// bootstraps the applications
		SpringApplication.run(ReadingListApplication.class, args);
	}

}
