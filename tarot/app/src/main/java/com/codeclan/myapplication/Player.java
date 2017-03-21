package com.codeclan.myapplication;

import java.util.*;

/**
 * Created by user on 19/03/2017.
 */

public class Player{
    Card card1;
    Card card2;
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

    //the player must be able to add cards to its hand
    public void addToHand(Card card){
        this.hand.add(card);
    }

    public void removeFromHand(Card card){
        hand.remove(card);
    }

    //need containsSuit() method which determines if the player has
    //a card of the required suit
    public boolean handContainsSuit(Suit suit) {
        for (Card card : this.hand) {
            if (card.getSuit() == suit) {
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }

    //need LowestInDeck() method which displays the lowest value card
    //in the hand

    public class cardValueComparator implements Comparator<Card> {
        public int compare(Card card1, Card card2) {
            if (card1.getGameValue() <= card2.getGameValue()){
                return card1.getGameValue();
            }
            else {
                return card2.getGameValue();
            }
        }
    }

    public Card lowestInHand(){
        Collections.sort(hand, new cardValueComparator());
        return hand.get(0);
    }

    //need LowestOfSuit(Suit suit) method which displays the lowest
    // value card in the hand of a given suit
    public Card lowestOfSuit(Suit suit){
        ArrayList<Card> cardsOfSuit = new ArrayList<Card>();
        for (Card card : hand){
            if(card.getSuit() == suit){
                cardsOfSuit.add(card);
            }
        }
        Collections.sort(cardsOfSuit, new cardValueComparator());
        return cardsOfSuit.get(0);
    }

    //winnings
    //need addToWinnings() method which will add a trick to the winnings.
    public void addToWinnings(ArrayList<Card> card){
        this.winnings.addAll(card);
    }

    public int winningsLength(){
        return winnings.size();
    }

    //need winValue() method which counts the winValues of all
    // cards in the winnings arraylist
    public int winningsValue(){
        int points = 0;
        for (Card card : winnings){
            points = points + card.getWinValue();
        }
        return points;
    }

    public void addTrickToWinnings(ArrayList<Card> trick){
        this.winnings.addAll(trick);
    }
}
