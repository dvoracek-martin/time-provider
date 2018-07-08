package com.javaproject.timeprovider.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.javaproject.timeprovider")
public class TimeProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimeProviderApplication.class, args);
    }
}