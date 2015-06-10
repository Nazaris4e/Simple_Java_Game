package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class BossEnemy extends GameObject{

	private int timer=0;
	private Random r = new Random();
	
	public BossEnemy(int x, int y, ID id) {
		super(x, y, id);
		velX = 0.0;
		velY = 2.0;
//		Game.sound.stopGameMusic();
//		Game.sound.playBossMusic();
	}


	public void tick() {
		
		x += velX;
		y += velY;
		
		if (timer++ >= 200){
			if(velX == 0.0) velX = 2.0;
			velX *= 1.001;
			velX = Game.clamp(velX, -10.0, 10.0);
			int spawn = r.nextInt((int)(100/Math.abs(velX))); // the faster he goes the more bullets he throws
			if (spawn == 0) Game.gameHandler.addObject(new BossEnemyBullet((int)(x+48), (int)(y+86), ID.BasicEnemy));
			}
		else if(timer++ >=150 ) velY = 0;
		//turn around:
		if(x <= 0 || x >= Game.WIDTH-96) velX *= -1.0;
	}


	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x,y,96,96);
	}

	public Rectangle getBounds() {
		return new Rectangle(x,y,96,96);
	}

	
}
