package com.tutorial.main;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseMove extends MouseAdapter{
	public static int mx;
	public static int my;
	public void mouseMoved(MouseEvent e) {
		
		mx = e.getX();
		my = e.getY();
		
		//System.out.println("X: " + mx + " Y: " + my);

		clearActiveButtons();
				// Game Screen
		if(Game.gameState == Game.STATE.Game || Game.gameState == Game.STATE.NewGame || Game.gameState == Game.STATE.Boss){
			Game.player.setX(mx-16);
			Game.player.setY(my-16);

		
		}		// Menu Screen
		else if(Game.gameState == Game.STATE.Menu){
		 if(mouseOver(mx, my, 210, 150, 200, 64)){
			Game.menu.playBtnActive = true;
		 }
		 else 
			 if (mouseOver(mx, my, 210, 250, 200, 64)){
					Game.menu.helpBtnActive = true;
		 }
		 else if(mouseOver(mx, my, 210, 350, 200, 64)){
				Game.menu.quitBtnActive = true;
		 }			 
		}
		
		
			// Help Screen
		else if(Game.gameState == Game.STATE.Help){
			if (mouseOver(mx, my, 210, 350, 200, 64)){
				Game.help.backBtnActive = true;
				}			
		
		}
					// End Screen
		else if(Game.gameState == Game.STATE.End){
		 if(mouseOver(mx, my, 210, 250, 200, 64)){
				Game.end.againBtnActive = true;
		 }
		 else if(mouseOver(mx, my, 210, 350, 200, 64)){
			Game.end.quitBtnActive = true;
		 }			 
		}

	} // end mouse moved

	public void mouseDragged(MouseEvent e) {mouseMoved(e);}
	
	private boolean mouseOver(int mx, int my, int x, int y, int width, int height){
		if(mx >= x && mx <= x + width && my >= y && my <= y + height)
			return true;
		else return false;
	}

	private void clearActiveButtons(){
		Game.menu.playBtnActive = false;
		Game.menu.helpBtnActive = false;
		Game.menu.quitBtnActive = false;
		Game.help.backBtnActive = false;
		Game.end.againBtnActive = false;
		Game.end.quitBtnActive = false;
	}
}
