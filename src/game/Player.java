package game;

public class Player {

    // Private attributes for a player (name, score, lastRoll)
    private String name;
    private int score;
    private int lastRoll;

    // Player contructor
    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // Set name of player
    public void setPlayerName(String name) {
        this.name = name;
    }

    // Get name of player
    public String getPlayerName() {
        return this.name;
    }

    // Set score of player
    public void setScore(int currentRollSum) {
        this.score += currentRollSum;
    }

    // Get score of player
    public int getScore() {
        return this.score;
    }

    // Reset a player score
    public void resetScore() {
        this.score = 0;
    }

    // Store the current roll sum in last roll
    public void setLastRoll(int currentRollSum) {
        this.lastRoll = currentRollSum;
    }

    // Returns last roll
    public int getLastRoll() {
        return lastRoll;
    }
}