package com.jm3003.learn.spring.core.thru.noxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Car car = ctx.getBean(HondaJazz.class, "hondaJazz");
		car.driveTheCar();
	}

}
