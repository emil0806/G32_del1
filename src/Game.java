import java.util.Scanner;

public class Game {
    private Player player1 = new Player("", 0);
    private Player player2 = new Player("", 0);
    private Cup cup = new Cup();
    private int turnCount = 0;

    private Scanner scanner = new java.util.Scanner(System.in);

    public void startGame() {
        System.out.println("Welcome to the best dice game in the World!");
        displayRules();
        System.out.println("Press ENTER to start the game");
        scanner.nextLine();

        System.out.print("Please enter player 1 name: ");
        player1.setPlayerName(scanner.nextLine());

        System.out.print("Please enter player 2 name: ");
        player2.setPlayerName(scanner.nextLine());

        System.out.println("Player 1 will start.");

        playGame();
    }

    public void playGame() {
        while ((player1.getScore() < 40 || player2.getScore() < 40)) {
            if (turnCount % 2 == 0 && (player1.getScore() >= 40 || player2.getScore() >= 40)) {
                break;
            } else if (turnCount % 2 == 0) {
                playerTurn(player1, cup);
            } else {
                playerTurn(player2, cup);
            }
        }
    }

    public void displayRules() {
        System.out.println("Get 40 or more points to win the game");
    }

    public void playerTurn(Player player, Cup cup) {
        System.out.println("Press ENTER to roll dice");
        scanner.nextLine();
        cup.setRollSum();

        System.out.println("Die 1: " + cup.getDie1());
        System.out.println("Die 2: " + cup.getDie2());

        player.setScore(cup.getRollSum());

        displayScoreboard();

        turnCount++;

    }

    public void displayScoreboard() {
        System.out.println(player1.getPlayerName() + ": " + player1.getScore());
        System.out.println(player2.getPlayerName() + ": " + player2.getScore());
    }
}
