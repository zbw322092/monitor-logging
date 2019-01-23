package com.art.monitorlogging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MonitorLoggingApplication {

  public static void main(String[] args) {
    SpringApplication.run(MonitorLoggingApplication.class, args);
  }

}

