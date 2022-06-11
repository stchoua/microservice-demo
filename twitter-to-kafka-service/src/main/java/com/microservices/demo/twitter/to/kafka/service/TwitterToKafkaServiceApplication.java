package com.microservices.demo.twitter.to.kafka.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// CommandLineRunner better option
// to ApplicationListener which ensures that the application only runs once.
@SpringBootApplication
public class TwitterToKafkaServiceApplication implements CommandLineRunner {

    // running this class starts the spring-boot application for us.
    public static void main(String[] args) {
        SpringApplication.run(TwitterToKafkaServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("App starts...");
    }
}
