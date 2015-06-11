package com.tutorial.main;

import java.awt.*;

public class Menu {
	public boolean contBtnActive = false;
	public boolean newBtnActive = false;
	public boolean helpBtnActive = false;
	public boolean quitBtnActive = false;

	public Rectangle contRect;
	public Rectangle newRect;
	public Rectangle helpRect;
	public Rectangle quitRect;
	private Point pausedPos;
	private Point contPos;
	private Point newPos;
	private Point helpPos;
	private Point quitPos;
	public void tick(){

						//If Game just starts
		if(Game.gameHandler.objectList.size() == 0){
			contRect = new Rectangle(-10000, -10000, 1, 1); // Take it away from the screen
			newRect = new Rectangle(210, 150, 200, 64);
			helpRect = new Rectangle(210, 250, 200, 64);
			quitRect = new Rectangle(210, 350, 200, 64);
			pausedPos = new Point(243, 70);
			contPos = new Point(-10000, -10000); // take it away from the screen
			newPos = new Point(237, 193);
			helpPos = new Point(275, 293);
			quitPos = new Point(275, 393);
		}
						//If Game is paused
		else {
			contRect = new Rectangle(210, 120, 200, 64);
			newRect = new Rectangle(210, 200, 200, 64);
			helpRect = new Rectangle(210, 280, 200, 64);
			quitRect = new Rectangle(210, 360, 200, 64);
			pausedPos = new Point(220, 70);
			contPos = new Point(248, 163);
			newPos = new Point(237, 243);
			helpPos = new Point(275, 323);
			quitPos = new Point(275, 403);
		}


	}
	public void render(Graphics g){

		Font fnt = new Font("arial", Font.PLAIN, 50);
		Font fnt2 = new Font("arial", Font.PLAIN, 30);
		g.setFont(fnt);
		g.setColor(Color.white);
		if(Game.gameHandler.objectList.size() != 0)
			g.drawString("Paused", (int)pausedPos.getX(), (int)pausedPos.getY());
		else
			g.drawString("Menu", (int) pausedPos.getX(), (int) pausedPos.getY());

		g.setFont(fnt2);

		
		g.setColor(Color.black);
		g.fillRect((int)contRect.getX(), (int)contRect.getY(), (int)contRect.getWidth(), (int)contRect.getHeight());
		g.fillRect((int)newRect.getX(), (int)newRect.getY(), (int)newRect.getWidth(), (int)newRect.getHeight());
		g.fillRect((int)helpRect.getX(), (int)helpRect.getY(), (int)helpRect.getWidth(), (int)helpRect.getHeight());
		g.fillRect((int)quitRect.getX(), (int)quitRect.getY(), (int)quitRect.getWidth(), (int)quitRect.getHeight());

		g.setColor(Color.white);
		g.drawRect((int)contRect.getX(), (int)contRect.getY(), (int)contRect.getWidth(), (int)contRect.getHeight());
		g.drawRect((int)newRect.getX(), (int)newRect.getY(), (int)newRect.getWidth(), (int)newRect.getHeight());
		g.drawRect((int)helpRect.getX(), (int)helpRect.getY(), (int)helpRect.getWidth(), (int)helpRect.getHeight());
		g.drawRect((int)quitRect.getX(), (int)quitRect.getY(), (int)quitRect.getWidth(), (int)quitRect.getHeight());


		g.drawString("Continue", (int)contPos.getX(), (int)contPos.getY());
		g.drawString("New Game", (int)newPos.getX(), (int)newPos.getY());
		g.drawString("Help", (int) helpPos.getX(), (int) helpPos.getY());
		g.drawString("Quit", (int)quitPos.getX(), (int)quitPos.getY());

		if(contBtnActive){
			g.fillRect((int)contRect.getX(), (int)contRect.getY(), (int)contRect.getWidth(), (int)contRect.getHeight());
			g.setColor(Color.black);
			g.drawString("Continue", (int)contPos.getX(), (int)contPos.getY());
		}
		else if(newBtnActive){
			g.fillRect((int)newRect.getX(), (int)newRect.getY(), (int)newRect.getWidth(), (int)newRect.getHeight());
			g.setColor(Color.black);
			g.drawString("New Game", (int) newPos.getX(), (int) newPos.getY());
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
