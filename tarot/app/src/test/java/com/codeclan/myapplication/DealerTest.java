package com.codeclan.myapplication;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static com.codeclan.myapplication.Suit.*;
import static com.codeclan.myapplication.Face.*;
import static junit.framework.Assert.assertEquals;


/**
 * Created by user on 21/03/2017.
 */

public class DealerTest {

    Dealer dealer;

    Card theMagician;
    Card thePriestess;
    Card theEmpress;
    Card theEmperor;
    Card theHierophant;
    Card theLovers;
    Card theChariot;
    Card strength;
    Card theHermit;
    Card theWheel;
    Card justice;
    Card theHangedMan;
    Card death;
    Card temperance;
    Card theDevil;
    Card theTower;
    Card theStar;
    Card theMoon;
    Card theSun;
    Card judgement;
    Card theWorld;

    Player player1;
    Player player2;
    Player player3;
    Player player4;

    @Before
    public void before() {
        dealer = new Dealer();

        theMagician = new Card(Suit.BOUT, Face.BOUT, 1, 5);
        thePriestess = new Card(Suit.BOUT, Face.BOUT, 2, 5);
        theEmpress = new Card(Suit.BOUT, Face.BOUT, 3, 5);
        theEmperor = new Card(Suit.BOUT, Face.BOUT, 4, 5);
        theHierophant = new Card(Suit.BOUT, Face.BOUT, 4, 5);
        theLovers = new Card(Suit.BOUT, Face.BOUT, 5, 5);
        theChariot = new Card(Suit.BOUT, Face.BOUT, 6, 5);
        strength = new Card(Suit.BOUT, Face.BOUT, 7, 5);
        theHermit = new Card(Suit.BOUT, Face.BOUT, 8, 5);
        theWheel = new Card(Suit.BOUT, Face.BOUT, 9, 5);
        justice = new Card(Suit.BOUT, Face.BOUT, 10, 5);
        theHangedMan = new Card(Suit.BOUT, Face.BOUT, 11, 5);
        death = new Card(Suit.BOUT, Face.BOUT, 12, 5);
        temperance = new Card(Suit.BOUT, Face.BOUT, 13, 5);
        theDevil = new Card(Suit.BOUT, Face.BOUT, 14, 5);
        theTower = new Card(Suit.BOUT, Face.BOUT, 15, 5);
        theStar = new Card(Suit.BOUT, Face.BOUT, 16, 5);
        theMoon = new Card(Suit.BOUT, Face.BOUT, 17, 5);
        theSun = new Card(Suit.BOUT, Face.BOUT, 19, 5);
        judgement = new Card(Suit.BOUT, Face.BOUT, 20, 5);
        theWorld = new Card(Suit.BOUT, Face.BOUT, 21, 5);


        player1 = new Player("Jim");
        player2 = new Player("Jom");
        player3 = new Player("Jam");
        player4 = new Player("Jum");
    }

    @Test
    public void canaddCardandShowTopCard(){
        dealer.add(theMagician);
        assertEquals(theMagician,dealer.showTopCard());
    }
//
//    @Test
//    public void canShuffle(){
//        dealer.add(theMagician);
//        dealer.add(judgement);
//        dealer.shuffle();
//        assertEquals(judgement, dealer.showTopCard());
//    }

    @Test
    public void canPopulateDeck(){
        ArrayList<Card> cards = new ArrayList<Card>();
        dealer.add(theMagician);
        dealer.add(thePriestess);
        dealer.add(theEmpress);
        dealer.add(theEmperor);
        dealer.add(theHierophant);
        dealer.add(theLovers);
        dealer.add(theChariot);
        dealer.add(strength);
        dealer.add(theHermit);
        dealer.add(theWheel);
        dealer.add(justice);
        dealer.add(theHangedMan);
        dealer.add(death);
        dealer.add(temperance);
        dealer.add(theDevil);
        dealer.add(theTower);
        dealer.add(theStar);
        dealer.add(theMoon);
        dealer.add(theSun);
        dealer.add(judgement);
        dealer.add(theWorld);

        dealer.deal(player1);

        assertEquals(18,player1.handLength());

    }



}
