package com.tutorial.main;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;

public class MenuParticle extends GameObject{

	private Random r = new Random();
	private Color color;
	
	public MenuParticle(int x, int y, ID id) {
		super(x, y, id);
		velX = r.nextInt(8)-4;
		velY = r.nextInt(8)-4;
		if(velX < 0) velX-=2;
		if(velX >= 0) velX+=3;	
		if(velY < 0) velY-=2;
		if(velY >= 0) velY+=3;
		
		color = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
	}


	public void tick() {
		x += velX;
		y += velY;
		if(y <= 0 || y >= Game.HEIGHT-16) velY *= -1;
		if(x <= 0 || x >= Game.WIDTH-16) velX *= -1;
		Game.menuHandler.addObject(new Trail(x, y, ID.Trail, color, 16, 16, 0.5f, 0.02f, Game.menuHandler));

	}


	public void render(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f));
		g.setColor(color);		
		g.fillRect(x,y,16,16);
	}

	public Rectangle getBounds() {
		return new Rectangle(x,y,16,16);
	}

	
}
