package com.codeclan.myapplication;

import java.util.ArrayList;

/**
 * Created by user on 19/03/2017.
 */

public class Game {

    Dealer dealer;
    Player playerOne;
    Player playerTwo;
    Player playerThree;
    Player playerFour;
    ArrayList<Card> trick;

    public Game(Dealer dealer, Player playerOne, Player playerTwo, Player playerThree, Player playerFour){
        this.dealer = dealer;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.playerThree = playerThree;
        this.playerFour = playerFour;
        this.trick = new ArrayList<Card>();
    }

    public Dealer getDealer() {
        return dealer;
    }

    public Player getPlayerOne() {
        return playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }

    public Player getPlayerThree() {
        return playerThree;
    }

    public Player getPlayerFour() {
        return playerFour;
    }

    public ArrayList<Card> getTrick() {
        return trick;
    }
}
