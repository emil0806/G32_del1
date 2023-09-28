package game;

public class Die {

    // Face value of die
    private int dieValue;

    // Die constructor
    public Die() {
    }

    // Sets die value to a random value from 1-6
    public void setDieValue() {
        dieValue = (int) Math.floor(Math.random() * (6 - 1 + 1) + 1);
    }

    // Gets die value
    public int getDieValue() {
        return dieValue;
    }

}
