public class Cup {

    private Die die1 = new Die();
    private Die die2 = new Die();

    private int currentRollSum;

    public Cup() {
        this.currentRollSum = 0;
    }

    public void setRollSum() {
        die1.setDieValue();
        die2.setDieValue();
        this.currentRollSum = die1.getDieValue() + die2.getDieValue();
    }

    public int getRollSum() {
        return this.currentRollSum;
    }

    public int getDie1() {
        return die1.getDieValue();
    }

    public int getDie2() {
        return die2.getDieValue();
    }
}