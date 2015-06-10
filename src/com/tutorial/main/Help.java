package com.tutorial.main;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Help {
	public boolean backBtnActive = false;
	public Rectangle backRect = new Rectangle(210, 350, 200, 64);
	private Point helpPos = new Point(240, 70);
	private Point backPos = new Point(275, 393);

	public void tick(){}
	
	public void render(Graphics g){
		Font fnt = new Font("arial", Font.PLAIN, 50);
		Font fnt2 = new Font("arial", Font.PLAIN, 30);
		Font fnt3 = new Font("arial", Font.PLAIN, 18);
		g.setFont(fnt);
		g.setColor(Color.white);
		g.drawString("Help", (int)helpPos.getX(), (int)helpPos.getY());
		
		g.setFont(fnt3);
		g.drawString("Use WSAD or arrows to move and dodge the enemies.", 100, 150);
		g.drawString("Press ESC for Menu.", 100, 200);

		g.setFont(fnt2);		
			
			g.setColor(Color.black);
			g.fillRect((int)backRect.getX(), (int)backRect.getY(), (int)backRect.getWidth(), (int)backRect.getHeight());
			g.setColor(Color.white);
			g.drawRect((int)backRect.getX(), (int)backRect.getY(), (int)backRect.getWidth(), (int)backRect.getHeight());
			g.drawString("Back", (int)backPos.getX(), (int)backPos.getY());
			if(backBtnActive){
				g.fillRect((int)backRect.getX(), (int)backRect.getY(), (int)backRect.getWidth(), (int)backRect.getHeight());
				g.setColor(Color.black);
				g.drawString("Back", (int)backPos.getX(), (int)backPos.getY());
			}
	}
}
