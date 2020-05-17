package com.jellyfishmix.selleurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SellEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SellEurekaApplication.class, args);
    }

}
