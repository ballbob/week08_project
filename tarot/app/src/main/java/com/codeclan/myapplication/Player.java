package com.codeclan.myapplication;

import java.util.ArrayList;

/**
 * Created by user on 19/03/2017.
 */

public class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<Card>();
    }

    public String getName(){
        return this.name;
    }

    public int handLength(){
        return this.hand.size();
    }

}
