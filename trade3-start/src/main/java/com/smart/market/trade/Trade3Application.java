package com.smart.market.trade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Trade3Application {

    public static void main(String[] args) {
        SpringApplication.run(Trade3Application.class, args);
    }

}
