package com.codeclan.myapplication;

import org.junit.Before;
import org.junit.Test;

import java.util.logging.Logger;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 20/03/2017.
 */

public class PlayerTest {

    Card kingOfHearts;
    Card twoOfHearts;
    Card knightOfSpades;
    Card theMagician;
    Player player;

    @Before
    public void before(){
        Card kingOfHearts = new Card(Suit.HEARTS,Face.KING,10,5);
        Card twoOfHearts = new Card(Suit.HEARTS,Face.TWO,1,1);
        Card knightOfSpades = new Card(Suit.SPADES,Face.KNIGHT,10,5);
        Card theMagician = new Card(Suit.BOUT,Face.BOUT,2,2);

        Player player = new Player("Chimmy");
    }

    @Test
    public void canGetName(){
        Player player = new Player("Chimmy");
        assertEquals("Chimmy", player.getName());
    }

    @Test
    public void handStartsEmpty(){
        Player player = new Player("Chimmy");
        assertEquals(0, player.handLength());
    }

    @Test
    public void canAddCardToHand(){
        Player player = new Player("Chimmy");
        Card twoOfHearts = new Card(Suit.HEARTS,Face.TWO,1,1);
        player.addToHand(twoOfHearts);
        assertEquals(1, player.handLength());
    }

}
