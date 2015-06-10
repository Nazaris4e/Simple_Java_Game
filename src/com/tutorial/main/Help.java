package com.tutorial.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Help {
	public boolean backBtnActive = false;

	public void tick(){}
	
	public void render(Graphics g){
		Font fnt = new Font("arial", 1, 50);
		Font fnt2 = new Font("arial", 1, 30);
		Font fnt3 = new Font("arial", 1, 18);
		g.setFont(fnt);
		g.setColor(Color.white);
		g.drawString("Help", 240, 70);
		
		g.setFont(fnt3);
		g.drawString("Use WSAD or arrows to move and dodge the enemies.", 100, 150);
		g.drawString("Press ESC for Menu.", 100, 200);

		g.setFont(fnt2);		
			
			g.setColor(Color.black);
			g.fillRect(210, 350, 200, 64);			
			g.setColor(Color.white);
			g.drawRect(210, 350, 200, 64);			
			g.drawString("Back", 275, 393);
			if(backBtnActive){
				g.fillRect(210, 350, 200, 64);			
				g.setColor(Color.black);
				g.drawString("Back", 275, 393);
			}
			
			
		
	}
	
}
