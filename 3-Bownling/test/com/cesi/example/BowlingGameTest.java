package com.cesi.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kriyss on 17/05/17.
 */
public class BowlingGameTest {


    @Test
    public void should_rool_and_score(){
        Game game = new BowlingGame();
        game.roll(3);
        game.roll(2);
        Assert.assertEquals(game.score(), 5);
    }

    @Test
    public void should_spare_and_score(){
        Game game = new BowlingGame();
        game.roll(5);
        game.roll(5);
        game.roll(3);
        Assert.assertEquals(game.score(), 16);
    }

    @Test
    public void should_strike_and_score(){
        Game game = new BowlingGame();
        game.roll(10);
        game.roll(2);
        game.roll(3);
        Assert.assertEquals(game.score(), 20);
    }

    @Test
    public void should_perfect_score(){
        Game game = new BowlingGame();
        for (int i = 0; i < 12; i++) {
            game.roll(10);
        }
        Assert.assertEquals(game.score(), 300);
    }

}