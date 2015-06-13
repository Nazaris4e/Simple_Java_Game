package com.tutorial.main;
import java.awt.*;

public class HealthCoin extends GameObject{
    private int healthValue;
    private int lifeTime = 750;
    public HealthCoin(int x, int y, int healthValue, Handler myHandler) {
        super(x, y, ID.HealthCoin, myHandler);
        velX = 0;
        velY = 0;
        width = 32;
        height = 32;
        this.healthValue = healthValue;
    }
    public int getHealthValue(){
        return healthValue;
    }
    public void tick() {
        if(lifeTime > 0)
            lifeTime--;
        else
            myHandler.removeObject(this);
    }
    public void render(Graphics g) {

        if(lifeTime/25 != 11 && lifeTime/25 != 9 && lifeTime/25 != 7 && lifeTime/25 != 5 && lifeTime/25 != 3 && lifeTime/25 != 1)
            {
            g.setColor(Color.white);
            g.drawString(Integer.toString(healthValue), x+8, y-5);
            g.fillRect(x, y, width, height);
            g.setColor(Color.red);
            g.fillRect(x+2,y+11,28,9);
            g.fillRect(x+11,y+2,9,28);
        }
    }
}
