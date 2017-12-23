package com.jm3003.learn.spring.core.thru.lessxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HondaAmaze implements Car {
	
	private MusicSystem musicSystem;
	
	
	public HondaAmaze(@Qualifier("appleMusicSystem") @Autowired MusicSystem musicSystem) {
		super();
		this.musicSystem = musicSystem;
	}



	public void driveTheCar() {
		System.out.println("Driving HondaAmaze");
		musicSystem.playTheMusic();
	}
}
