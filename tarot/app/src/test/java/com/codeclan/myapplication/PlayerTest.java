package com.codeclan.myapplication;

import org.junit.Before;
import org.junit.Test;
import java.util.logging.Logger;

import static com.codeclan.myapplication.Suit.*;
import static com.codeclan.myapplication.Face.*;
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
        kingOfHearts = new Card(Suit.HEARTS,Face.KING,10,5);
        twoOfHearts = new Card(Suit.HEARTS,Face.TWO,1,1);
        knightOfSpades = new Card(SPADES,Face.KNIGHT,10,5);
        theMagician = new Card(Suit.BOUT,Face.BOUT,2,2);

        player = new Player("Chimmy");
    }

    @Test
    public void canGetName(){
        assertEquals("Chimmy", player.getName());
    }

    @Test
    public void handStartsEmpty(){
        assertEquals(0, player.handLength());
    }

    @Test
    public void canAddCardToHand(){
        player.addToHand(twoOfHearts);
        assertEquals(1, player.handLength());
    }

    @Test
    public void canRemoveCard(){
        player.addToHand(twoOfHearts);
        player.removeFromHand(twoOfHearts);
        assertEquals(0,player.handLength());
    }

    @Test
    public void canCheckIfHandContainsSuit(){
        player.addToHand(twoOfHearts);
        assertEquals(true,player.handContainsSuit(Suit.HEARTS));
    }

    @Test
    public void canCheckHandDoesNotContainSuit(){
        player.addToHand(twoOfHearts);
        assertEquals(false,player.handContainsSuit(SPADES));
    }

    @Test
    public void winningsStartEmpty(){
        assertEquals(0, player.winningsLength());
    }

    @Test
    public void canAddCardToWinnings(){
        player.addToWinnings(twoOfHearts);
        assertEquals(1,player.winningsLength());
    }

    @Test
    public void canFindLowestInHand(){
        player.addToHand(twoOfHearts);
        player.addToHand(kingOfHearts);
        assertEquals(twoOfHearts,player.lowestInHand());
    }

    @Test
    public void canPlayLowestOfSuit(){
        player.addToHand(twoOfHearts);
        player.addToHand(kingOfHearts);
        player.addToHand(knightOfSpades);
        assertEquals(twoOfHearts,player.lowestOfSuit(HEARTS));
    }

    @Test
    public void canAddUpWinnings(){
        player.addToWinnings(twoOfHearts);
        player.addToWinnings(kingOfHearts);
        player.addToWinnings(theMagician);
        assertEquals(8,player.winningsValue());
    }
}
