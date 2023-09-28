package game;

public class Cup {

    // Creates two dice in a cup
    private Die die1 = new Die();
    private Die die2 = new Die();

    // Control the current roll sum
    private int currentRollSum;

    // Cup constructor
    public Cup() {
        this.currentRollSum = 0;
    }

    // Rolls each die and sets the sum
    public void setRollSum() {
        die1.setDieValue();
        die2.setDieValue();
        this.currentRollSum = die1.getDieValue() + die2.getDieValue();
    }

    // Gets roll sum
    public int getRollSum() {
        return this.currentRollSum;
    }

    // Get value of die 1
    public int getDie1() {
        return die1.getDieValue();
    }

    // Get value of die 2
    public int getDie2() {
        return die2.getDieValue();
    }
}