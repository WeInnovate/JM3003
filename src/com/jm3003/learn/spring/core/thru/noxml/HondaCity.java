package com.jm3003.learn.spring.core.thru.noxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("hc")
public class HondaCity implements Car {
	
	private MusicSystem musicSystem;
	
	@Autowired
	@Qualifier("sonyMusicSystem")
	public void setMusicSystem(MusicSystem musicSystem) {
		this.musicSystem = musicSystem;
	}

	public void driveTheCar() {
		System.out.println("Driving HondaCity");
		musicSystem.playTheMusic();
	}
	
	
}
