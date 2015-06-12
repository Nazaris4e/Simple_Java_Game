package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Player extends GameObject{
	private int hurtCounter = 0;

	public Player(int x, int y, ID id, Handler myHandler) {
		super(x, y, id, myHandler);
	}
	
	public void tick(){
			x += velX;
			y += velY;	
		
		x = Game.clamp(x, 0, Game.WIDTH-32);
		y = Game.clamp(y, 0, Game.HEIGHT-60);
		collision();

		if(hurtCounter > 0)
			hurtCounter--;
	}
	private void collision(){
		for(int i = 0; i < Game.gameHandler.objectList.size(); i++){
			GameObject tempObject = Game.gameHandler.objectList.get(i);
			if(tempObject.id == ID.BasicEnemy || tempObject.id == ID.FastEnemy || tempObject.id == ID.SmartEnemy || tempObject.id == ID.BossEnemy){
				if(getBounds().intersects(tempObject.getBounds())){
					// collision code
					Game.hud.HEALTH -= 2;
					Game.sound.sayOuche();
					hurtCounter = 30;
					if (Game.hud.HEALTH == 0)
						hurtCounter = 0;
				}
			} else if (tempObject.id == ID.HealthCoin) {
				if (getBounds().intersects(tempObject.getBounds())) {
					Game.hud.HEALTH += ((HealthCoin) tempObject).getHealthValue();
					Game.gameHandler.removeObject(tempObject);
				}
			}
		}
	}
	
	public void render(Graphics g){

		 // Makes player blink red when hurted
	if(hurtCounter/5 == 5 || hurtCounter/5 == 3 || hurtCounter/5 == 1){
		g.setColor(Color.red);
		g.fillRect(x, y, 32, 32);
	}
	else{
		g.setColor(Color.white);
		g.fillRect(x, y, 32, 32);
	}
}

	public Rectangle getBounds() {
		return new Rectangle(x,y,32,32);
	}
}
