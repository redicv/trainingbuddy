package com.nexttune.tune;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.nexttune") 
@SpringBootApplication
public class TuneApplication {

	public static void main(String[] args) {
		SpringApplication.run(TuneApplication.class, args);

		   ;
	}

}
