package game;

public class Player {

    private String name;
    private int score;
    private int lastRoll;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public void setPlayerName(String name) {
        this.name = name;
    }

    public String getPlayerName() {
        return this.name;
    }

    public void setScore(int currentRollSum) {
        this.score += currentRollSum;
    }

    public int getScore() {
        return this.score;
    }

    public void resetScore() {
        this.score = 0;
    }

    public void setLastRoll(int currentRollSum) {
        this.lastRoll = currentRollSum;
    }

    public int getLastRoll() {
        return lastRoll;
    }
}