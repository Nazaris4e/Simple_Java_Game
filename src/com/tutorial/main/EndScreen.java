package com.tutorial.main;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class EndScreen {
	public boolean againBtnActive = false;
	public boolean quitBtnActive = false;
	public Rectangle againRect = new Rectangle(210, 250, 200, 64);
	public Rectangle quitRect = new Rectangle(210, 350, 200, 64);
	private Point overPos = new Point(190, 70);
	private Point yourScorePos = new Point(220, 143);
	private Point scorePos = new Point(290, 183);
	private Point againPos = new Point(240, 293);
	private Point quitPos = new Point(275, 393);


	public void tick() {

	}

	public void render(Graphics g) {
		Font fnt = new Font("arial", Font.PLAIN, 50);
		Font fnt2 = new Font("arial", Font.PLAIN, 30);
		g.setFont(fnt);
		g.setColor(Color.white);
		g.drawString("Game over", (int) overPos.getX(), (int) overPos.getY());

		g.setFont(fnt2);
		g.drawString("Your Score is:", (int) yourScorePos.getX(), (int) yourScorePos.getY());
		g.drawString("" + Game.hud.getScore(), (int) scorePos.getX(), (int) scorePos.getY());

		g.setColor(Color.white);
		if (againBtnActive) {
			g.fillRect((int) againRect.getX(), (int) againRect.getY(), (int) againRect.getWidth(), (int) againRect.getHeight());
			g.setColor(Color.black);
		}
		g.drawString("Play Again", (int) againPos.getX(), (int) againPos.getY());
		g.drawRect((int) againRect.getX(), (int) againRect.getY(), (int) againRect.getWidth(), (int) againRect.getHeight());

		g.setColor(Color.white);
		if (quitBtnActive) {
			g.fillRect((int) quitRect.getX(), (int) quitRect.getY(), (int) quitRect.getWidth(), (int) quitRect.getHeight());
			g.setColor(Color.black);
		}
		g.drawString("Quit", (int) quitPos.getX(), (int) quitPos.getY());
		g.drawRect((int) quitRect.getX(), (int) quitRect.getY(), (int) quitRect.getWidth(), (int) quitRect.getHeight());
	}
}
