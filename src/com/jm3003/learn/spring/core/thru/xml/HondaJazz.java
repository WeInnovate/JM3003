package com.jm3003.learn.spring.core.thru.xml;

public class HondaJazz implements Car {

	private MusicSystem musicSystem;

	public HondaJazz(MusicSystem theMusicSystem) {
		this.musicSystem = theMusicSystem;
	}

	public void driveTheCar() {
		System.out.println("Driving HondaJazz");
		musicSystem.playTheMusic();
	}
}
