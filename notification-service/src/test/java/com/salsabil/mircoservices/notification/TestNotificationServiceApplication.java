package com.salsabil.mircoservices.notification;

import org.springframework.boot.SpringApplication;

import com.salsabil.microservices.notification.NotificationServiceApplication;

public class TestNotificationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(NotificationServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
