package com.jm3003.learn.spring.core.thru.lessxml;

import org.springframework.stereotype.Component;

@Component
public class PhilipsMusicSystem implements MusicSystem {

	@Override
	public void playTheMusic() {
		System.out.println("Playing music on PhilipsMusicSystem");
	}
}
