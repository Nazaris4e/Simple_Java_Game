package com.tutorial.main;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseInput extends MouseAdapter {

	
	public void mousePressed(MouseEvent e){
		 int mx = e.getX();
		 int my = e.getY();
		// 	System.out.println("Pressed at X: " + mx + " Y: " + my);
		 			// Menu Screen
		 if(Game.gameState == Game.STATE.Menu){
			 if(mouseOver(mx, my, 210, 150, 200, 64)){
					if(Game.menu.playBtnActive) 
						if(Game.hud.getLevel() == HUD.BossLevel)
							Game.gameState = Game.STATE.Boss;
						else
							Game.gameState = Game.STATE.Game;
			 }
			 else 
				 if (mouseOver(mx, my, 210, 250, 200, 64)){
					Game.gameState = Game.STATE.Help;
			 }
			 else if(mouseOver(mx, my, 210, 350, 200, 64)){System.exit(1);
			 }			 
		 }
		 			// Help Screen
		 else if(Game.gameState == Game.STATE.Help){
				if (mouseOver(mx, my, 210, 350, 200, 64)){
					Game.gameHandler.objectList.clear();
					Game.gameState = Game.STATE.Menu; 
					}			
			}
		 			// End Screen
		 else if(Game.gameState == Game.STATE.End){
			 if(mouseOver(mx, my, 210, 250, 200, 64)){
				 Game.gameState = Game.STATE.NewGame;
			 }
			 else if(mouseOver(mx, my, 210, 350, 200, 64)){
				 System.exit(1);
			 }			 
		 }	

	} // end Mouse pressed
	
	

	private boolean mouseOver(int mx, int my, int x, int y, int width, int height){
		if(mx >= x && mx <= x + width && my >= y && my <= y + height)
			return true;
		else return false;
	}


	
}
