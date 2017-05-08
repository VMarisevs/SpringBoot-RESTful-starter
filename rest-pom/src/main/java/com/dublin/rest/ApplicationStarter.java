package com.dublin.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.dublin.config"})
public class ApplicationStarter {
  public static void main(String[] args) {
    SpringApplication.run(ApplicationStarter.class, args);
  }
}
