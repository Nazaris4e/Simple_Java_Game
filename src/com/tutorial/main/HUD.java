package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;

public class HUD {
	
	public int HEALTH = 100;
	public static int BossLevel = 7;
	private int greenValue = 255;
	
	private int score = 0;
	private int level = 1;
		
	public void tick(){
		HEALTH = Game.clamp(HEALTH, 0, 100);
		greenValue = HEALTH*2;
		greenValue = Game.clamp(greenValue, 0, 255);
		score++;
		if(score % 250 == 249 && Game.gameState != Game.STATE.Boss) // stop counting levels if it is boss
			level++;
		if(HEALTH == 0)
			Game.gameState = Game.STATE.End;
		else if (level == BossLevel)
			Game.gameState = Game.STATE.Boss;
			
	}
	
	public void render(Graphics g){
		g.setColor(Color.gray);
		g.fillRect(15,15,200,32);
		g.setColor(new Color(75, greenValue, 0));
		g.fillRect(15,15,2*HEALTH,32);
		g.setColor(Color.white);
		g.drawRect(15,15,200,32);
		
		g.drawString("Score: " + score, 15, 64);
		g.drawString("Level: " + level, 15, 80);
		
	}
	
	public void setScore(int score){
		this.score = score;
	}
	public int getScore(){
		return score;
	}
	public void setLevel(int level){
		this.level = level;
	}
	public int getLevel(){
		return level;
	}	
	
}
