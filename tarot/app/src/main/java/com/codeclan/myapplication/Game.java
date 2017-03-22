package com.codeclan.myapplication;

import android.util.Log;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.rotate;

/**
 * Created by user on 19/03/2017.
 */

public class Game {

    private Dealer dealer;
    private ArrayList<Card> trick;
    private Player playerOne;
    private Player playerTwo;
    private Player playerThree;
    private Player playerFour;
    private Player nextPlayer;
    private List<Player> players;
    private ArrayList<Player> discountedPlayers;
    private int trickWinCount;
    private Card theMagician;
    private Card thePriestess;
    private Card theEmpress;
    private Card theEmperor;
    private Card theHierophant;
    private Card theLovers;
    private Card theChariot;
    private Card strength;
    private Card theHermit;
    private Card theWheel;
    private Card justice;
    private Card theHangedMan;
    private Card death;
    private Card temperance;
    private Card theDevil;
    private Card theTower;
    private Card theStar;
    private Card theMoon;
    private Card theSun;
    private Card judgement;
    private Card theWorld;
    private Card card1;
    private Card card2;
    private Card card3;
    private Card card4;
    private Card card5;
    private Card card6;
    private Card card7;
    private Card card8;
    private Card card9;
    private Card card10;
    private Card card11;
    private Card card12;
    private Card card13;
    private Card card14;
    private Card card15;
    private Card card16;
    private Card card17;
    private Card card18;
    private Card card19;
    private Card card20;
    private Card card21;
    private Card card22;
    private Card card23;
    private Card card24;
    private Card card25;
    private Card card26;
    private Card card27;
    private Card card28;
    private Card card29;
    private Card card30;
    private Card card31;
    private Card card32;
    private Card card33;
    private Card card34;
    private Card card35;
    private Card card36;
    private Card card37;
    private Card card38;
    private Card card39;
    private Card card40;
    private Card card41;
    private Card card42;
    private Card card43;
    private Card card44;
    private Card card45;
    private Card card46;
    private Card card47;
    private Card card48;
    private Card card49;
    private Card card50;
    private Card card51;
    private Card card52;
    private Card card53;
    private Card card54;
    private Card card55;
    private Card card56;
    private Card[] cardArray;

    public Game(Dealer dealer) {
        this.dealer = dealer;
        this.players = new ArrayList<Player>();
        this.trick = new ArrayList<Card>();
        this.discountedPlayers = new ArrayList<Player>();
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

    public Player getPlayerFour() {return playerFour;}

    public Dealer getDealer() {
        return dealer;
    }

    public ArrayList<Card> getTrick() {
        return trick;
    }

    public Card getTopOfTrick() {
        return trick.get(trick.size()-1);
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

        playerOne = new Player("Jim");
        playerTwo = new Player("Jam");
        playerThree = new Player("Jem");
        playerFour = new Player("Jum");

        dealer.populateDeck(cardArray);
        dealer.shuffle();

        players.add(playerOne);
        players.add(playerTwo);
        players.add(playerThree);
        players.add(playerFour);

        for (Player player : players) {
            dealer.deal(player);
        }
    }

    public void turn(){

        trick.clear();

        int trickWinCount = 0;

        //play the first card

        //while-loop: only breaks when trick won

        while (trickWinCount == 0 && this.players.size() > 1){
//
//            System.out.println(players.get(0).lowestInHand().getFace() + " of " + players.get(0).lowestInHand().getSuit());
//            for (Player player : players){
//                for (Card card : player.hand){
//                    System.out.println(card.getFace() + " of " + card.getSuit());
//                }
//            }
//
            trick.add(0,this.players.get(0).lowestInHand());
            this.players.get(0).removeFromHand(this.players.get(0).lowestInHand());

            //remove a player from players if their hand is empty
            for (int i=0; i<players.size(); i++) {
                if (players.get(i).handLength() == 0) {
                    this.discountedPlayers.add(0, players.get(i));
                    this.players.remove(players.get(i));
                }
            }


            if (this.players.get(1).handContainsSuit( getTopOfTrick().getSuit() )){

                trick.add(trick.size()-1,this.players.get(1).lowestOfSuit( getTopOfTrick().getSuit() ));

                this.players.get(1).removeFromHand(this.players.get(1).lowestOfSuit(getTopOfTrick().getSuit()));

                rotate(players,1);

                System.out.println("The player had a card of the right suit.");

            }

            else if (this.players.get(1).handContainsSuit(Suit.BOUT)){

                trick.add(trick.size()-1,this.players.get(1).lowestOfSuit(Suit.BOUT));

                this.players.get(1).removeFromHand(this.players.get(1).lowestOfSuit(Suit.BOUT));

                rotate(players,1);

                System.out.println("The player had a bout.");
            }

            else{
                trickWinCount = trickWinCount+1;
                trick.add(trick.size()-1,this.players.get(1).lowestInHand());
                this.players.get(1).removeFromHand(players.get(1).lowestInHand());
                this.players.get(0).addTrickToWinnings(trick);

                System.out.println("The player had neither a heart nor a bout, and folded.");
            }
        }

    }
}

    //need 'game' method: if players.size() == 1, count everyone's winnings and display them.

    //need 'winnings count' method: display the winnings result for every player.

