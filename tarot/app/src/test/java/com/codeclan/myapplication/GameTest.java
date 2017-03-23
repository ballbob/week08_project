package com.codeclan.myapplication;

import org.junit.Before;
import org.junit.Test;

import static com.codeclan.myapplication.Suit.*;
import static com.codeclan.myapplication.Face.*;
import static junit.framework.Assert.*;

/**
 * Created by user on 21/03/2017.
 */

public class GameTest {

    Dealer dealer;

    Game game;

    Player playerOne;
    Player playerTwo;
    Player playerThree;
    Player playerFour;

    @Before
    public void before(){
        dealer = new Dealer();
        game = new Game(dealer);
        game.setUp();
    }

    @Test
    public void canGetDealer(){
        assertEquals(dealer, game.getDealer());
    }
//
//    @Test
//    public void canGetPlayerOne(){
//        assertEquals("Jim",game.getPlayerOne().getName());
//    }
//
//    @Test
//    public void canGetPlayerTwo(){
//        assertEquals("Jam",game.getPlayerTwo().getName());
//    }
//
//    @Test
//    public void canGetPlayerThree(){
//        assertEquals("Jem",game.getPlayerThree().getName());
//    }
//
//    @Test
//    public void canGetPlayerFour(){
//        assertEquals("Jum",game.getPlayerFour().getName());
//    }


    @Test
    public void canSetUp(){
        assertEquals(5,dealer.deckSize());
        assertEquals(18,game.getPlayerOne().handLength());
        assertEquals(18,game.getPlayerTwo().handLength());
        assertEquals(18,game.getPlayerThree().handLength());
        assertEquals(18,game.getPlayerFour().handLength());
    }

//    @Test
//    public void canRunTurn(){
//        game.turn();
//        assertEquals(0,game.getPlayerOne().winningsLength());
//        assertEquals(0,game.getPlayerTwo().winningsLength());
//        assertEquals(0,game.getPlayerThree().winningsLength());
//        assertEquals(0,game.getPlayerFour().winningsLength());
//    }

//    @Test
//    public void canRunGame(){
//        assertEquals("Failure: no winner.",game.game());
//    }

    @Test
    public void canDisplayScores(){
        game.game();
        assertEquals("Failure",game.getScores());
    }
}
