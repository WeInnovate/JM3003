package com.jm3003.learn.spring.core.thru.noxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
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
