package com.luv2code.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//explicit component scan
/*@SpringBootApplication(scanBasePackages = {"com.luv2code.springcoredemo",
		"com.luv2code.util"})*/

//Dy default will scan on pacakge in SpringcoredemoApplication.java is der
@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
