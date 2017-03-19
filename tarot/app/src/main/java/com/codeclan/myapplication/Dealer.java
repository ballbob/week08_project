package com.codeclan.myapplication;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by user on 19/03/2017.
 */

public class Dealer {
    private ArrayList<Card> deck;

    public void populateDeck(Card[] cards) {
        this.deck.addAll(Arrays.asList(cards));
    }



}
