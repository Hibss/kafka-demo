package com.syz.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class HystrixApplication {
	// swagger 地址http://localhost:8882/doc.html
	public static void main(String[] args) {
		SpringApplication.run(HystrixApplication.class, args);
	}

}
