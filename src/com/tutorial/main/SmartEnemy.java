package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class SmartEnemy extends GameObject{

	public SmartEnemy(int x, int y, ID id, Handler myHandler) {
		super(x, y, id, myHandler);
	
		velX = 5;
		velY = 5;
		width = 16;
		height = 16;
	}

	public void tick() {
		
		float diffX = x - Game.player.getX() - width/2;
		float diffY = y - Game.player.getY() - height/2;
		float distance = (float)Math.sqrt(diffX*diffX+diffY*diffY);
		velX = (int) (-3*diffX/distance);
		velY = (int) (-3*diffY/distance);
		
		x += velX;
		y += velY;
		if(y <= 0 || y >= Game.HEIGHT-height) velY *= -1;
		if(x <= 0 || x >= Game.WIDTH-width) velX *= -1;
		Game.gameHandler.addObject(new Trail(x, y, ID.Trail, Color.orange, width, height, 1.0f, 0.02f, Game.gameHandler));

	}

	public void render(Graphics g) {
		g.setColor(Color.orange);
		g.fillRect(x, y, width, height);
	}
}
