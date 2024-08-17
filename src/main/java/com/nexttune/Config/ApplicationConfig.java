package com.nexttune.Config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration

@EnableJpaRepositories(basePackages= "com.nexttune.repository")

@EntityScan(basePackages="com.nexttune.model")


public class ApplicationConfig {
    
}
