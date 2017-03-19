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

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Face getFace() {
        return face;
    }

    public void setFace(Face face) {
        this.face = face;
    }

    public int getGameValue() {
        return gameValue;
    }

    public void setGameValue(int gameValue) {
        this.gameValue = gameValue;
    }

    public int getWinValue() {
        return winValue;
    }

    public void setWinValue(int winValue) {
        this.winValue = winValue;
    }
}
