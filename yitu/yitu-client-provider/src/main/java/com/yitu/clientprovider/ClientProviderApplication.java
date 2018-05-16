package com.yitu.clientprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClientProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientProviderApplication.class, args);
    }
}
