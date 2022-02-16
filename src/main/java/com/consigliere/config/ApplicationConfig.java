package com.consigliere.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages="com.consigliere.repository")
@EntityScan(basePackages="com.consigliere.entity")

@ComponentScan
public class ApplicationConfig {
}
