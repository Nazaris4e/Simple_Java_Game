package com.tutorial.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class EndScreen {
	public boolean againBtnActive = false;
	public boolean quitBtnActive = false;
	
	public void tick(){
		
	}
	
	public void render(Graphics g){
		Font fnt = new Font("arial", 1, 50);
		Font fnt2 = new Font("arial", 1, 30);
		g.setFont(fnt);
		g.setColor(Color.white);
		g.drawString("Game over", 190, 70);

		g.setFont(fnt2);
		g.drawString("Your Score is:", 220, 143);
		g.drawString(""+Game.hud.getScore(), 290, 183);

		g.setColor(Color.white);
		if(againBtnActive){
			g.fillRect(210, 250, 200, 64);
			g.setColor(Color.black);			
		}
			g.drawString("Play Again", 240, 293);
			g.drawRect(210, 250, 200, 64);			
	
	
		g.setColor(Color.white);
		if(quitBtnActive){
			g.fillRect(210, 350, 200, 64);
			g.setColor(Color.black);			
		}
			g.drawString("Quit", 275, 393);
			g.drawRect(210, 350, 200, 64);			
	
	
	
	}
	
}
