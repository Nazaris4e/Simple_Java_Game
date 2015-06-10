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
		 if(mouseOver(mx, my, (int)Game.menu.contRect.getX(), (int)Game.menu.contRect.getY(), (int)Game.menu.contRect.getWidth(), (int)Game.menu.contRect.getHeight())){
			Game.menu.contBtnActive = true;
		 }
		 else 
			 if (mouseOver(mx, my, (int)Game.menu.helpRect.getX(), (int)Game.menu.helpRect.getY(), (int)Game.menu.helpRect.getWidth(), (int)Game.menu.helpRect.getHeight())){
					Game.menu.helpBtnActive = true;
		 }
		 else if(mouseOver(mx, my, (int)Game.menu.quitRect.getX(), (int)Game.menu.quitRect.getY(), (int)Game.menu.quitRect.getWidth(), (int)Game.menu.quitRect.getHeight())){
				Game.menu.quitBtnActive = true;
		 }			 
		}

			// Help Screen
		else if(Game.gameState == Game.STATE.Help){
			if (mouseOver(mx, my, (int) Game.help.backRect.getX(), (int) Game.help.backRect.getY(), (int) Game.help.backRect.getWidth(), (int) Game.help.backRect.getHeight())){
				Game.help.backBtnActive = true;
				}			
		
		}
					// End Screen
		else if(Game.gameState == Game.STATE.End){
		 if(mouseOver(mx, my, (int)Game.end.againRect.getX(), (int)Game.end.againRect.getY(), (int)Game.end.againRect.getWidth(), (int)Game.end.againRect.getHeight())){
				Game.end.againBtnActive = true;
		 }
		 else if(mouseOver(mx, my, (int)Game.end.quitRect.getX(), (int)Game.end.quitRect.getY(), (int)Game.end.quitRect.getWidth(), (int)Game.end.quitRect.getHeight())){
			Game.end.quitBtnActive = true;
		 }			 
		}

	} // end mouse moved

	public void mouseDragged(MouseEvent e) {mouseMoved(e);}
	
	private boolean mouseOver(int mx, int my, int x, int y, int width, int height){
		return (mx >= x && mx <= x + width && my >= y && my <= y + height);
	}

	private void clearActiveButtons(){
		Game.menu.contBtnActive = false;
		Game.menu.helpBtnActive = false;
		Game.menu.quitBtnActive = false;
		Game.help.backBtnActive = false;
		Game.end.againBtnActive = false;
		Game.end.quitBtnActive = false;
	}
}
