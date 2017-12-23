package com.jm3003.learn.spring.core.thru.noxml;

import org.springframework.stereotype.Component;

@Component
public class SonyMusicSystem implements MusicSystem {

	@Override
	public void playTheMusic() {
		System.out.println("Playing music on SonyMusicSystem");
	}
}
