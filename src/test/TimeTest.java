package test;

import game.*;

import org.junit.Assert;
import org.junit.Test;

public class TimeTest {

    private Game newGame = new Game();
    private Player player = new Player("", 0);
    private Cup cup = new Cup();

    /*
     * Test the elapsed time from when playerturn() is called until finished.
     * If this it below 333 milliseconds, the program definetely prints out the
     * result of a roll
     * in less than 333 milliseconds.
     */
    @Test
    public void testTime() {
        // Start timer
        long startTime = System.nanoTime();

        newGame.playerTurn(player, cup);

        // End timer
        long endTime = System.nanoTime();
        // Calculate elapsed time milliseconds
        double totalTime = (endTime - startTime) / (double) 1000000.0;
        // Compare to 333 milliseconds
        Assert.assertTrue(333 > totalTime);
    }

}
