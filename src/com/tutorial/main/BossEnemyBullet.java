package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class BossEnemyBullet extends GameObject{

	private Random r = new Random();
	public BossEnemyBullet(int x, int y, ID id, Handler myHandler) {
		super(x, y, id, myHandler);
		velX = r.nextInt(10)-5;
		velY = 5;
		width = 16;
		height = 16;
		Game.sound.playBossShot();
	}

	public void tick() {
		x += velX;
		y += velY;
		
		Game.gameHandler.addObject(new Trail(x, y, ID.Trail, Color.red, width, height, 1.0f, 0.02f, Game.gameHandler));

		if(y >= Game.HEIGHT)
			Game.gameHandler.removeObject(this);
		
	}

	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x, y, width, height);
	}

}
