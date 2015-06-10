package com.tutorial.main;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.URL;

public class Sound {

	private AudioClip gameMusic;
	private AudioClip bossMusic;
	private AudioClip bossShot;
	private AudioClip ouche;
	
	public Sound(){
		try{
		URL urlGameMusic = new File("sounds/game.wav").toURI().toURL();
		URL urlBossMusic = new File("sounds/boss.wav").toURI().toURL();	
		URL urlBossShot = new File("sounds/boss_shot.wav").toURI().toURL();	
		URL urlOuche = new File("sounds/Ouche.wav").toURI().toURL();	
		gameMusic = Applet.newAudioClip(urlGameMusic);
		bossMusic = Applet.newAudioClip(urlBossMusic);
		bossShot = Applet.newAudioClip(urlBossShot);		
		ouche = Applet.newAudioClip(urlOuche);		
		}
		catch(Exception e){e.printStackTrace();}
	}

	public void playGameMusic(){gameMusic.loop();}
	public void stopGameMusic(){gameMusic.stop();}
	public void playBossMusic(){bossMusic.loop();}
	public void stopBossMusic(){bossMusic.stop();}
	public void playBossShot(){bossShot.play();}
	public void sayOuche(){ouche.play();}
	
}
