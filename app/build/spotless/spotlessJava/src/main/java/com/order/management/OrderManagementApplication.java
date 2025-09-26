package com.order.management;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class OrderManagementApplication {
  public static void main(String[] args) {
    log.info("Starting application with args....");
    SpringApplication.run(OrderManagementApplication.class);
    log.info("Application started successfully...");
  }
}
