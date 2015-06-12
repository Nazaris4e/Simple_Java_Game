package com.tutorial.main;

import java.io.Serializable;

public class Score implements Serializable{
    private int score = 0;

    public Score(int score){
        this.score = score;
    }

    public int getScore(){
        return score;
    }

}
