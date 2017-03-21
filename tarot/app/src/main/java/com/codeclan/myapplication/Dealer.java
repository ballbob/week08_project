package com.codeclan.myapplication;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by user on 19/03/2017.
 */

public class Dealer {
    private ArrayList<Card> deck;

    public Dealer(){
        this.deck = new ArrayList<Card>();
    }

    public void populateDeck(Card[] cards) {
        this.deck.addAll(Arrays.asList(cards));
    }

    public void add(Card card){
        this.deck.add(card);
    }

    public Card showTopCard(){
        return deck.get(0);
    }

    public void shuffle(){
        Collections.shuffle(deck);
    }

    public void deal(Player player){
        for(int i = 0; i < 18; i++) {
            player.addToHand(this.deck.get(0));
        }
    }

    public int deckSize(){
        return this.deck.size();
    }

}
