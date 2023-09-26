class Player {

    private String name;
    private int score;

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

    public void setScore(int currentrollSum) {
        this.score += currentrollSum;
    }

    public int getScore() {
        return this.score;
    }

    public void resetScore() {
        this.score = 0;
    }
}