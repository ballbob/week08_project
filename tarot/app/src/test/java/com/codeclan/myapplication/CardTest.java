package com.codeclan.myapplication;

import org.junit.Before;
import org.junit.Test;

import static com.codeclan.myapplication.Suit.*;
import static com.codeclan.myapplication.Face.*;
import static junit.framework.Assert.*;

/**
 * Created by user on 19/03/2017.
 */

public class CardTest {

    Card card1;

    @Before
    public void before(){
        card1 = new Card(HEARTS, KING, 10, 5);
    }

    @Test
    public void canGetSuit(){
        assertEquals(HEARTS,card1.getSuit());
    }

    @Test
    public void canGetFace(){
        assertEquals(KING,card1.getFace());
    }

    @Test
    public void canGetGameValue(){
        assertEquals(10,card1.getGameValue());
    }

    @Test
    public void canGetWinValue(){
        assertEquals(5,card1.getWinValue());
    }

}
