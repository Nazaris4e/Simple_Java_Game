package com.tutorial.main;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Menu {
	public boolean playBtnActive = false;
	public boolean helpBtnActive = false;
	public boolean quitBtnActive = false;
	public void tick(){
		
	}
	public void render(Graphics g){

		
		Font fnt = new Font("arial", 1, 50);
		Font fnt2 = new Font("arial", 1, 30);
		g.setFont(fnt);
		g.setColor(Color.white);
		g.drawString("Menu", 240, 70);
		g.setFont(fnt2);			

		
		g.setColor(Color.black);
		g.fillRect(210, 150, 200, 64);			
		g.fillRect(210, 250, 200, 64);
		g.fillRect(210, 350, 200, 64);

		g.setColor(Color.white);
		g.drawRect(210, 150, 200, 64);			
		g.drawRect(210, 250, 200, 64);
		g.drawRect(210, 350, 200, 64);

		g.drawString("Play", 275, 193);
		g.drawString("Help", 275, 293);
		g.drawString("Quit", 275, 393);
		
		if(playBtnActive){
			g.fillRect(210, 150, 200, 64);			
			g.setColor(Color.black);
			g.drawString("Play", 275, 193);
		}
		else if(helpBtnActive){
			g.fillRect(210, 250, 200, 64);
			g.setColor(Color.black);			
			g.drawString("Help", 275, 293);
		}
		else if(quitBtnActive){
			g.fillRect(210, 350, 200, 64);
			g.setColor(Color.black);			
			g.drawString("Quit", 275, 393);
		}
		
/*		
		g.setColor(Color.white);
		if(playBtnActive){
			g.fillRect(210, 150, 200, 64);			
			g.setColor(Color.black);
		}
			g.drawString("Play", 275, 193);
			g.drawRect(210, 150, 200, 64);			
		
		g.setColor(Color.white);		
		if(helpBtnActive){
			g.fillRect(210, 250, 200, 64);
			g.setColor(Color.black);			
		}
			g.drawString("Help", 275, 293);
			g.drawRect(210, 250, 200, 64);			

		g.setColor(Color.white);
		if(quitBtnActive){
			g.fillRect(210, 350, 200, 64);
			g.setColor(Color.black);			
		}
			g.drawString("Quit", 275, 393);
			g.drawRect(210, 350, 200, 64);			
*/		
	}
	
}
