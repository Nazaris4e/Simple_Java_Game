package com.tutorial.main;

import java.awt.*;

public class Menu {
	public boolean contBtnActive = false;
	public boolean helpBtnActive = false;
	public boolean quitBtnActive = false;
	public Rectangle contRect = new Rectangle(210, 150, 200, 64);
	public Rectangle helpRect = new Rectangle(210, 250, 200, 64);
	public Rectangle quitRect = new Rectangle(210, 350, 200, 64);
	private Point pausedPos = new Point(240, 70);
	private Point contPos = new Point(248, 193);
	private Point helpPos = new Point(275, 293);
	private Point quitPos = new Point(275, 393);
	public void tick(){
		
	}
	public void render(Graphics g){

		
		Font fnt = new Font("arial", Font.PLAIN, 50);
		Font fnt2 = new Font("arial", Font.PLAIN, 30);
		g.setFont(fnt);
		g.setColor(Color.white);
		g.drawString("Paused", (int)pausedPos.getX(), (int)pausedPos.getY());
		g.setFont(fnt2);

		
		g.setColor(Color.black);
		g.fillRect((int)contRect.getX(), (int)contRect.getY(), (int)contRect.getWidth(), (int)contRect.getHeight());
		g.fillRect((int)helpRect.getX(), (int)helpRect.getY(), (int)helpRect.getWidth(), (int)helpRect.getHeight());
		g.fillRect((int)quitRect.getX(), (int)quitRect.getY(), (int)quitRect.getWidth(), (int)quitRect.getHeight());

		g.setColor(Color.white);
		g.drawRect((int)contRect.getX(), (int)contRect.getY(), (int)contRect.getWidth(), (int)contRect.getHeight());
		g.drawRect((int)helpRect.getX(), (int)helpRect.getY(), (int)helpRect.getWidth(), (int)helpRect.getHeight());
		g.drawRect((int)quitRect.getX(), (int)quitRect.getY(), (int)quitRect.getWidth(), (int)quitRect.getHeight());


		g.drawString("Continue", (int)contPos.getX(), (int)contPos.getY());
		g.drawString("Help", (int) helpPos.getX(), (int) helpPos.getY());
		g.drawString("Quit", (int)quitPos.getX(), (int)quitPos.getY());

		if(contBtnActive){
			g.fillRect((int)contRect.getX(), (int)contRect.getY(), (int)contRect.getWidth(), (int)contRect.getHeight());
			g.setColor(Color.black);
			g.drawString("Continue", (int)contPos.getX(), (int)contPos.getY());
		}
		else if(helpBtnActive){
			g.fillRect((int)helpRect.getX(), (int)helpRect.getY(), (int)helpRect.getWidth(), (int)helpRect.getHeight());
			g.setColor(Color.black);
			g.drawString("Help", (int) helpPos.getX(), (int) helpPos.getY());
		}
		else if(quitBtnActive){
			g.fillRect((int)quitRect.getX(), (int)quitRect.getY(), (int)quitRect.getWidth(), (int)quitRect.getHeight());
			g.setColor(Color.black);
			g.drawString("Quit", (int)quitPos.getX(), (int)quitPos.getY());
		}
		
	}
	
}
