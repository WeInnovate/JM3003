package com.jm3003.learn.spring.core.thru.noxml;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.jm3003.learn.spring.core.thru.noxml")
@PropertySource("classpath:car.properties")
public class AppConfig {

}
