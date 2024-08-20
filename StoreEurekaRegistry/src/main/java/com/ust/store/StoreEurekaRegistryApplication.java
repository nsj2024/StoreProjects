package com.ust.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StoreEurekaRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreEurekaRegistryApplication.class, args);
	}

}
