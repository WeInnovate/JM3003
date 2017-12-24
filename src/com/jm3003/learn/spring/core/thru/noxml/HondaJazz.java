package com.jm3003.learn.spring.core.thru.noxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HondaJazz implements Car {

	// @Value("1001")
	@Value("${hondaJazz.modelNumber}")
	private long modelNumber;

	// @Value("BLACK")
	@Value("${hondaJazz.color}")
	private String color;

	// @Value("23.7")
	@Value("${hondaJazz.mileage}")
	private double mileage;

	// @Value("200")
	@Value("${hondaJazz.maxSpeed}")
	private int maxSpeed;

	@Autowired
	@Qualifier("philipsMusicSystem")
	private MusicSystem musicSystem;

	public void driveTheCar() {
		StringBuilder sb = new StringBuilder();
		sb.append("Driving ").append(modelNumber).append(" ").append(color).append(" HondaJazz with speed of ")
				.append(maxSpeed).append("KM/H and mileage of ").append(mileage).append("KM/L");
		System.out.println(sb.toString());
		musicSystem.playTheMusic();
	}
}
