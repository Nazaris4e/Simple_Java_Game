package com.tutorial.main;
import java.awt.*;

public class ScoreCoin extends GameObject{
    private int scoreValue;
    private int lifeTime = 750;
    public ScoreCoin(int x, int y, ID id, int scoreValue, Handler myHandler) {
        super(x, y, id, myHandler);
        velX = 0;
        velY = 0;
        width = 32;
        height = 32;
        this.scoreValue = scoreValue;
    }
    public int getScoreValue(){
        return scoreValue;
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
            g.setColor(Color.green);
            g.fillRect(x, y, width, height);
            g.setColor(Color.black);
            g.fillRect(x+2, y+2, 28, 28);
            g.setColor(Color.green);
            g.drawString(Integer.toString(scoreValue), x+4, y+20);
        }
    }
}
