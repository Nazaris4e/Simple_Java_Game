package com.tutorial.main;

import java.awt.Graphics;
import java.util.LinkedList;

public class Handler {

	LinkedList<GameObject> objectList = new LinkedList<GameObject>();
	
	public void tick(){
		for(int i = 0; i < objectList.size(); i++){
			GameObject tempObject = objectList.get(i);
			tempObject.tick();
		}
		
	}
	public void render(Graphics g){
		for(int i = 0; i < objectList.size(); i++){
			if(objectList.size() != 0){
				GameObject tempObject = objectList.get(i);
				tempObject.render(g);
			}
		}
	}
	
	public void addObject(GameObject object){
		objectList.add(object);
	}
	public void removeObject(GameObject object){
		objectList.remove(object);
	}
	public void clearEnemies(){
		for(int i = 0; i < objectList.size(); i++){
			GameObject tempObject = objectList.get(i);
			if(tempObject.getId() == ID.Player){
			objectList.clear();
//			addObject(new Player(tempObject.getX(),tempObject.getY(), ID.Player));				
			addObject(Game.player);				
			}
		}
	}
}
