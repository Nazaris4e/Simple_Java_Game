package com.tutorial.main;
import java.awt.*;

public class HealthCoin extends GameObject{
    private int healthValue;
    public HealthCoin(int x, int y, ID id, int healthValue, Handler myHandler) {
        super(x, y, id, myHandler);
        velX = 0;
        velY = 0;
        this.healthValue = healthValue;
    }
    public int getHealthValue(){
        return healthValue;
    }
    public void tick() {
    }
    public void render(Graphics g) {
        g.setColor(Color.white);
        g.drawString(Integer.toString(healthValue), x+8, y-5);

        g.fillRect(x,y,32,32);
        g.setColor(Color.red);
        g.fillRect(x+2,y+11,28,9);
        g.fillRect(x+11,y+2,9,28);

    }
    public Rectangle getBounds() {
        return new Rectangle(x,y,32,32);
    }
}
