package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class SmartEnemy extends GameObject{

	private GameObject player;
	
	public SmartEnemy(int x, int y, ID id, Handler myHandler) {
		super(x, y, id, myHandler);
	
		for(int i = 0; i < Game.gameHandler.objectList.size(); i++)
			if (Game.gameHandler.objectList.get(i).getId() == ID.Player)
				player = Game.gameHandler.objectList.get(i);
		
		
		velX = 5;
		velY = 5;
	}


	public void tick() {
		
		float diffX = x - player.getX() - 8;
		float diffY = y - player.getY() - 8;
		float distance = (float)Math.sqrt(diffX*diffX+diffY*diffY);
		velX = (int) (-3*diffX/distance);
		velY = (int) (-3*diffY/distance);
		
		x += velX;
		y += velY;
		if(y <= 0 || y >= Game.HEIGHT-16) velY *= -1;
		if(x <= 0 || x >= Game.WIDTH-16) velX *= -1;
		Game.gameHandler.addObject(new Trail(x, y, ID.Trail, Color.orange, 16, 16, 1.0f, 0.02f, Game.gameHandler));

	}


	public void render(Graphics g) {
		g.setColor(Color.orange);
		g.fillRect(x,y,16,16);
	}

	public Rectangle getBounds() {
		return new Rectangle(x,y,16,16);
	}

	
}
