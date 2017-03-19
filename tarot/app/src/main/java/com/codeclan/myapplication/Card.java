package com.codeclan.myapplication;

/**
 * Created by user on 19/03/2017.
 */

public class Card {

    private Suit suit;
    private Face face;
    private int gameValue;
    private int winValue;

    public Card(Suit suit, Face face, int gameValue, int winValue){
        this.suit = suit;
        this.face = face;
        this.gameValue = gameValue;
        this.winValue = winValue;
    }

    public Suit getSuit() {
        return suit;
    }

    public Face getFace() {
        return face;
    }

    public int getGameValue() {
        return gameValue;
    }

    public int getWinValue() {
        return winValue;
    }
}
