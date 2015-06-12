package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class BasicEnemy extends GameObject{
	
	public BasicEnemy(int x, int y, ID id, Handler myHandler) {
		super(x, y, id, myHandler);
		velX = 5;
		velY = 5;
		width = 16;
		height = 16;
	}

	public void tick() {
		x += velX;
		y += velY;
		if(y <= 0 || y >= Game.HEIGHT-height) velY *= -1;
		if(x <= 0 || x >= Game.WIDTH-width) velX *= -1;
		Game.gameHandler.addObject(new Trail(x, y, ID.Trail, Color.red, width, height, 1.0f, 0.02f, Game.gameHandler));

	}

	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x,y,width,height);
	}
}
