package com.jm3003.learn.spring.core.thru.noxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car car = ctx.getBean(HondaJazz.class, "hondaJazz");
		 car.driveTheCar();
		
		/*
		Car car1 = ctx.getBean(HondaAmaze.class, "hondaAmaze");
		Car car2 = ctx.getBean(HondaAmaze.class, "hondaAmaze");
		Car car3 = ctx.getBean(HondaAmaze.class, "hondaAmaze");
		System.out.println(car1.hashCode() + "\n" + car2.hashCode() + "\n" + car3.hashCode());
		*/
	}

}
