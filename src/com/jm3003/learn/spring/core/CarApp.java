package com.jm3003.learn.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		Car	car = ctx.getBean(Car.class, "car");
		car.driveTheCar();
	}

}
