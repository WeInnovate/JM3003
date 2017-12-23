package com.jm3003.learn.spring.core.thru.noxml;

import org.springframework.stereotype.Component;

@Component
public class AppleMusicSystem implements MusicSystem {

	@Override
	public void playTheMusic() {
		System.out.println("Playing music on AppleMusicSystem");
	}
}
