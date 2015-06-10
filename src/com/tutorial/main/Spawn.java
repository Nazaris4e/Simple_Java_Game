package com.tutorial.main;

import java.util.Random;

public class Spawn {

	private Random r = new Random();
	private int prevLevel = -1;

	public void tick(){
		if(Game.hud.getLevel() != prevLevel){ // do only when level changes
			prevLevel = Game.hud.getLevel();
		if(Game.hud.getLevel() == 2)
			Game.gameHandler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH-32),r.nextInt(Game.HEIGHT-32), ID.BasicEnemy));
				else if(Game.hud.getLevel() == 3){
			Game.gameHandler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH-32),r.nextInt(Game.HEIGHT-32), ID.BasicEnemy));
			Game.gameHandler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH-32),r.nextInt(Game.HEIGHT-32), ID.BasicEnemy));
		}
		else if(Game.hud.getLevel() == 4){
			Game.gameHandler.addObject(new FastEnemy(r.nextInt(Game.WIDTH-32),r.nextInt(Game.HEIGHT-32), ID.FastEnemy));
		}
		else if(Game.hud.getLevel() == 5){
			Game.gameHandler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH-32),r.nextInt(Game.HEIGHT-32), ID.SmartEnemy));
		}
		else if(Game.hud.getLevel() == 6){
			Game.gameHandler.addObject(new FastEnemy(r.nextInt(Game.WIDTH-32),r.nextInt(Game.HEIGHT-32), ID.FastEnemy));
		}
		else  if(Game.gameState == Game.STATE.Boss){

			
			Game.gameHandler.clearEnemies();
			
				Game.gameHandler.addObject(new BossEnemy(Game.WIDTH/2-48,-100, ID.BasicEnemy));
		}
		
		
}
	}
}
