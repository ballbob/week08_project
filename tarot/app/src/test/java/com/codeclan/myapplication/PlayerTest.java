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
        Card kingOfHearts = new Card(Suit.HEARTS,Face.KING,10,5);
        Card twoOfHearts = new Card(Suit.HEARTS,Face.TWO,1,1);
        Card knightOfSpades = new Card(SPADES,Face.KNIGHT,10,5);
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

    @Test
    public void canRemoveCard(){
        Player player = new Player("Chimmy");
        Card twoOfHearts = new Card(Suit.HEARTS,Face.TWO,1,1);
        player.addToHand(twoOfHearts);
        player.removeFromHand(twoOfHearts);
        assertEquals(0,player.handLength());
    }

    @Test
    public void canCheckIfHandContainsSuit(){
        Player player = new Player("Chimmy");
        Card twoOfHearts = new Card(Suit.HEARTS,Face.TWO,1,1);
        player.addToHand(twoOfHearts);
        assertEquals(true,player.handContainsSuit(Suit.HEARTS));
    }

    @Test
    public void canCheckHandDoesNotContainSuit(){
        Player player = new Player("Chimmy");
        Card twoOfHearts = new Card(Suit.HEARTS,Face.TWO,1,1);
        player.addToHand(twoOfHearts);
        assertEquals(false,player.handContainsSuit(SPADES));
    }

    @Test
    public void winningsStartEmpty(){
        Player player = new Player("Chimmy");
        assertEquals(0, player.winningsLength());
    }

    @Test
    public void canAddCardToWinnings(){
        Player player = new Player("Chimmy");
        Card twoOfHearts = new Card(Suit.HEARTS,Face.TWO,1,1);
        player.addToWinnings(twoOfHearts);
    }

}
