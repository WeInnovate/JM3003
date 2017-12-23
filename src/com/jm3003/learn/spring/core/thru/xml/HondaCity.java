package com.jm3003.learn.spring.core.thru.xml;

public class HondaCity implements Car {
	
	private MusicSystem musicSystem;
	
	public void driveTheCar() {
		System.out.println("Driving HondaCity");
		musicSystem.playTheMusic();
	}
	
	public void setMusicSystem(MusicSystem theMusicSystem) {
		this.musicSystem = theMusicSystem;
	}
}
