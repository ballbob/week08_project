package com.codeclan.myapplication;

import java.lang.reflect.Array;
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
    Card card1;
    Card card2;
    Card card3;
    Card card4;
    Card card5;
    Card card6;
    Card card7;
    Card card8;
    Card card9;
    Card card10;
    Card card11;
    Card card12;
    Card card13;
    Card card14;
    Card card15;
    Card card16;
    Card card17;
    Card card18;
    Card card19;
    Card card20;
    Card card21;
    Card card22;
    Card card23;
    Card card24;
    Card card25;
    Card card26;
    Card card27;
    Card card28;
    Card card29;
    Card card30;
    Card card31;
    Card card32;
    Card card33;
    Card card34;
    Card card35;
    Card card36;
    Card card37;
    Card card38;
    Card card39;
    Card card40;
    Card card41;
    Card card42;
    Card card43;
    Card card44;
    Card card45;
    Card card46;
    Card card47;
    Card card48;
    Card card49;
    Card card50;
    Card card51;
    Card card52;
    Card card53;
    Card card54;
    Card card55;
    Card card56;
    Card[] cardArray;

    public Game(Dealer dealer, Player playerOne, Player playerTwo, Player playerThree, Player playerFour) {
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

    public Card getTopOfTrick() {
        return trick.get(0);
    }

    public void setUp() {
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
        card1 = new Card(Suit.HEARTS, Face.KING, 10, 5);
        card2 = new Card(Suit.HEARTS, Face.QUEEN, 10, 5);
        card3 = new Card(Suit.HEARTS, Face.JACK, 10, 5);
        card4 = new Card(Suit.HEARTS, Face.TEN, 10, 1);
        card5 = new Card(Suit.HEARTS, Face.NINE, 9, 1);
        card6 = new Card(Suit.HEARTS, Face.EIGHT, 8, 1);
        card7 = new Card(Suit.HEARTS, Face.SEVEN, 7, 1);
        card8 = new Card(Suit.HEARTS, Face.SIX, 6, 1);
        card9 = new Card(Suit.HEARTS, Face.FIVE, 5, 1);
        card10 = new Card(Suit.HEARTS, Face.FOUR, 4, 1);
        card11 = new Card(Suit.HEARTS, Face.THREE, 3, 1);
        card12 = new Card(Suit.HEARTS, Face.TWO, 2, 1);
        card13 = new Card(Suit.HEARTS, Face.ACE, 1, 1);
        card14 = new Card(Suit.DIAMONDS, Face.KING, 10, 5);
        card15 = new Card(Suit.DIAMONDS, Face.QUEEN, 10, 5);
        card16 = new Card(Suit.DIAMONDS, Face.JACK, 10, 5);
        card17 = new Card(Suit.DIAMONDS, Face.TEN, 10, 1);
        card18 = new Card(Suit.DIAMONDS, Face.NINE, 9, 1);
        card19 = new Card(Suit.DIAMONDS, Face.EIGHT, 8, 1);
        card20 = new Card(Suit.DIAMONDS, Face.SEVEN, 7, 1);
        card21 = new Card(Suit.DIAMONDS, Face.SIX, 6, 1);
        card22 = new Card(Suit.DIAMONDS, Face.FIVE, 5, 1);
        card23 = new Card(Suit.DIAMONDS, Face.FOUR, 4, 1);
        card24 = new Card(Suit.DIAMONDS, Face.THREE, 3, 1);
        card25 = new Card(Suit.DIAMONDS, Face.TWO, 2, 1);
        card26 = new Card(Suit.DIAMONDS, Face.ACE, 1, 1);
        card27 = new Card(Suit.CLUBS, Face.KING, 10, 5);
        card28 = new Card(Suit.CLUBS, Face.QUEEN, 10, 5);
        card29 = new Card(Suit.CLUBS, Face.JACK, 10, 5);
        card30 = new Card(Suit.CLUBS, Face.TEN, 10, 1);
        card31 = new Card(Suit.CLUBS, Face.NINE, 9, 1);
        card32 = new Card(Suit.CLUBS, Face.EIGHT, 8, 1);
        card33 = new Card(Suit.CLUBS, Face.SEVEN, 7, 1);
        card34 = new Card(Suit.CLUBS, Face.SIX, 6, 1);
        card35 = new Card(Suit.CLUBS, Face.FIVE, 5, 1);
        card36 = new Card(Suit.CLUBS, Face.FOUR, 4, 1);
        card37 = new Card(Suit.CLUBS, Face.THREE, 3, 1);
        card38 = new Card(Suit.CLUBS, Face.TWO, 2, 1);
        card39 = new Card(Suit.CLUBS, Face.ACE, 1, 1);
        card40 = new Card(Suit.SPADES, Face.KING, 10, 5);
        card41 = new Card(Suit.SPADES, Face.QUEEN, 10, 5);
        card42 = new Card(Suit.SPADES, Face.JACK, 10, 5);
        card43 = new Card(Suit.SPADES, Face.TEN, 10, 1);
        card44 = new Card(Suit.SPADES, Face.NINE, 9, 1);
        card45 = new Card(Suit.SPADES, Face.EIGHT, 8, 1);
        card46 = new Card(Suit.SPADES, Face.SEVEN, 7, 1);
        card47 = new Card(Suit.SPADES, Face.SIX, 6, 1);
        card48 = new Card(Suit.SPADES, Face.FIVE, 5, 1);
        card49 = new Card(Suit.SPADES, Face.FOUR, 4, 1);
        card50 = new Card(Suit.SPADES, Face.THREE, 3, 1);
        card51 = new Card(Suit.SPADES, Face.TWO, 2, 1);
        card52 = new Card(Suit.SPADES, Face.ACE, 1, 1);
        card53 = new Card(Suit.SPADES, Face.KNIGHT, 1, 5);
        card54 = new Card(Suit.HEARTS, Face.KNIGHT, 1, 5);
        card55 = new Card(Suit.DIAMONDS, Face.KNIGHT, 1, 5);
        card56 = new Card(Suit.CLUBS, Face.KNIGHT, 1, 5);

        Card[] cardArray = {
                card1, card2, card3, card4, card5, card6, card7, card8, card9, card10, card11, card12, card13,
                card14, card15, card16, card17, card18, card19, card20, card21, card22, card23, card24, card25,
                card26, card27, card28, card29, card30, card31, card32, card33, card34, card35, card36, card37,
                card38, card39, card40, card41, card42, card43, card44, card45, card46, card47, card48, card49,
                card50, card51, card52, card53, card54, card55, card56,
                theMagician, thePriestess, theEmpress, theEmperor, theHierophant, theLovers, theChariot,
                strength, theHermit, theWheel, justice, theHangedMan, death, temperance, theDevil, theTower,
                theStar, theMoon, theSun, judgement, theWorld
        };
        dealer.populateDeck(cardArray);

        dealer.shuffle();

        dealer.deal(playerOne);
        dealer.deal(playerTwo);
        dealer.deal(playerThree);
        dealer.deal(playerFour);
    }

    public void turn() {

        ArrayList<Player> players = new ArrayList<Player>();
        players.add(playerOne);
        players.add(playerTwo);
        players.add(playerThree);
        players.add(playerFour);

        for (Player player : players) {

            //remove the player from play if their hand is empty
            if (player.handLength() == 0) {
                players.remove(player);
            }
            //start play: add a card to the trick
            else {
                trick.add(player.lowestInHand());
            }


                //if the next player has a card of the right suit, add it to the trick
                if (player.handContainsSuit(trick.get(0).getSuit())) {
                    if (player.handContainsSuit(Suit.BOUT)) {
                        trick.add(player.lowestOfSuit(Suit.BOUT));

                        //once bouts are exhausted, the next player plays their lowest
                    } else {
                        trick.add(player.lowestInHand());
                        //and the trick is added to their winnings
                        player.addToWinnings(trick);
                    }
                } else {
                    trick.add(player.lowestOfSuit(trick.get(0).getSuit()));
                }
            }
        }
    }



//    public String game() {
//        ArrayList<Player> players = new ArrayList<Player>();
//        players.add(playerOne);
//        players.add(playerTwo);
//        players.add(playerThree);
//        players.add(playerFour);
//
//        for (Player player : players) {
//            if (player.winningsValue() == 0) {
//                turn();
//            } else {
//                return player + " wins, with " + player.winningsValue() + "points.";
//            }
//        }
//        return "No winner.";
//    }

