package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;

public class Player extends GameObject{
	Random r = new Random();
	
	public Player(int x, int y, ID id) {
		super(x, y, id);
	}
	
	public void tick(){
			x += velX;
			y += velY;	
		
		x = Game.clamp(x, 0, Game.WIDTH-32);
		y = Game.clamp(y, 0, Game.HEIGHT-60);
		collision();

	}
	private void collision(){
		for(int i = 0; i < Game.gameHandler.objectList.size(); i++){
			GameObject tempObject = Game.gameHandler.objectList.get(i);
			if(tempObject.id == ID.BasicEnemy || tempObject.id == ID.FastEnemy || tempObject.id == ID.SmartEnemy){
				if(getBounds().intersects(tempObject.getBounds())){
					// collision code
					Game.hud.HEALTH -= 2;
					Game.sound.sayOuche();
				}
			}
		}
	}
	
	public void render(Graphics g){
		
		Graphics2D g2d = (Graphics2D) g;
		
		g.setColor(Color.white);
		g.fillRect(x, y, 32, 32);
	}

	public Rectangle getBounds() {
		return new Rectangle(x,y,32,32);
	}
}
