package com.jm3003.learn.spring.core.thru.noxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HondaJazz implements Car {

	@Autowired
	@Qualifier("philipsMusicSystem")
	private MusicSystem musicSystem;

	public void driveTheCar() {
		System.out.println("Driving HondaJazz");
		musicSystem.playTheMusic();
	}
}
