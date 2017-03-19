package com.codeclan.myapplication;

import java.util.ArrayList;

/**
 * Created by user on 19/03/2017.
 */

public class Player {

    private String name;
    private ArrayList<Card> hand;
    private ArrayList<Card> winnings;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<Card>();
        this.winnings = new ArrayList<Card>();
    }

    public String getName(){
        return this.name;
    }

    //the player must be able to declare its hand is empty to be
    //discounted by the game class
    public int handLength(){
        return this.hand.size();
    }

    //need containsSuit() method which determines if the player has
    //a card of the required suit

    //need LowestInDeck() method which displays the lowest value card
    //in the hand

    //need LowestOfSuit(Suit suit) method which displays the lowest
    // value card in the hand of a given suit

    //need addToWinnings() method which will add a trick to the winnings.

    //need winValue() method which counts the winValues of all
    // cards in the winnings arraylist

}
