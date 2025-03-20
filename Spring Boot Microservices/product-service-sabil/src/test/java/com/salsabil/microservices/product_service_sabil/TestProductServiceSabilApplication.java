package com.salsabil.microservices.product_service_sabil;

import org.springframework.boot.SpringApplication;

public class TestProductServiceSabilApplication {

	public static void main(String[] args) {
		SpringApplication.from(ProductServiceSabilApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
