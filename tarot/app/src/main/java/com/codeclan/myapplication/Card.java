package com.codeclan.myapplication;

/**
 * Created by user on 19/03/2017.
 */

public class Card {

    Private Suit suit;
    Private Face face;
    private int gameValue;
    private int winValue;

    public Card(Suit suit, Face face, int gameValue, int winValue){
        this.suit = suit;
        this.face = face;
        this.gameValue = gameValue;
        this.winValue = winValue;
    }

    public Private getSuit() {
        return Suit;
    }

    public void setSuit(Private suit) {
        Suit = suit;
    }

    public Private getFace() {
        return Face;
    }

    public void setFace(Private face) {
        Face = face;
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
