package com.demo.nacosservicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableDiscoveryClient
public class NacosServiceDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosServiceDiscoveryApplication.class, args);
    }
}
