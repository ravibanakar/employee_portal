package com.emp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableConfigurationProperties
@EnableMongoRepositories
@SpringBootApplication
public class EmployeePortalApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeePortalApplication.class, args);
    }
}
