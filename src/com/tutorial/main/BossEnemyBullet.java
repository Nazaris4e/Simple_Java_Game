package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class BossEnemyBullet extends GameObject{

	private Random r = new Random();
	public BossEnemyBullet(int x, int y, ID id) {
		super(x, y, id);
		velX = r.nextInt(10)-5;
		velY = 5;
		Game.sound.playBossShot();
	}

	public void tick() {
		x += velX;
		y += velY;
		
		Game.gameHandler.addObject(new Trail(x, y, ID.Trail, Color.red, 16, 16, 1.0f, 0.02f, Game.gameHandler));

		if(y >= Game.HEIGHT)
			Game.gameHandler.removeObject(this);
		
	}


	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x,y,16,16);
	}

	public Rectangle getBounds() {
		return new Rectangle(x,y,16,16);
	}

	
}
