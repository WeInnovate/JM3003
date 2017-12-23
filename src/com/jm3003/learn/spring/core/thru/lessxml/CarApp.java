package com.jm3003.learn.spring.core.thru.lessxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/jm3003/learn/spring/core/thru/lessxml/spring-config-less.xml");
		Car	car = ctx.getBean(HondaJazz.class, "hondaJazz");
		car.driveTheCar();
	}

}
