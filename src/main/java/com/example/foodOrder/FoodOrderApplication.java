package com.example.foodOrder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoodOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodOrderApplication.class, args);
		System.out.println("connected Successfully");
	}

}
