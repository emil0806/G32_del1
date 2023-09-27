package test;

import game.*;

import org.junit.Assert;
import org.junit.Test;

public class TimeTest {

    private Game newGame = new Game();
    private Player player = new Player("", 0);
    private Cup cup = new Cup();

    @Test
    public void TestTime() {

        long startTime = System.nanoTime();

        newGame.playerTurn(player, cup);

        long endTime = System.nanoTime();
        double totalTime = (endTime - startTime) / (double) 1000000.0;

        Assert.assertTrue(333 > totalTime);
    }

}
