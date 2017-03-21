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

    Player player1;
    Player player2;
    Player player3;
    Player player4;

    Game game;

    @Before
    public void before(){
        dealer = new Dealer();

        player1 = new Player("Jim");
        player2 = new Player("Jom");
        player3 = new Player("Jam");
        player4 = new Player("Jum");

        game = new Game(dealer, player1, player2, player3, player4);
    }

    @Test
    public void canGetDealer(){
        assertEquals(dealer, game.getDealer());
    }

    @Test
    public void canGetPlayer1(){
        assertEquals(player1,game.getPlayerOne());
    }

    @Test
    public void canGetPlayer2(){
        assertEquals(player2,game.getPlayerTwo());
    }

    @Test
    public void canGetPlayer3(){
        assertEquals(player3,game.getPlayerThree());
    }

    @Test
    public void canGetPlayer4(){
        assertEquals(player4,game.getPlayerFour());
    }

    @Test
    public void canSetUp(){
        game.setUp();
        assertEquals(77,dealer.deckSize());
        assertEquals(18,player1.handLength());
        assertEquals(18,player2.handLength());
        assertEquals(18,player3.handLength());
        assertEquals(18,player4.handLength());
    }

    @Test
    public void canRunTurn(){
        game.setUp();
        game.turn();
        assertEquals(0,player1.winningsValue());
        assertEquals(0,player2.winningsValue());
        assertEquals(0,player3.winningsValue());
        assertEquals(0,player4.winningsValue());
    }
}
