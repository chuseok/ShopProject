package com.example.shopproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopProjectApplication {

	public static void main(String[] args) {
		Hello hello = new Hello();
		hello.setData("hello");
		String data =hello.getData();
		SpringApplication.run(ShopProjectApplication.class, args);
	}

}
