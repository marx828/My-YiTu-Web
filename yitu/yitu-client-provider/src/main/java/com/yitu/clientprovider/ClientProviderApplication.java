package com.yitu.clientprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ClientProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientProviderApplication.class, args);
    }
}
