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

        System.out.println("Please enter player 1 name: ");
        player1.setPlayerName(scanner.nextLine());
        System.out.println("Please enter player 2 name: ");
        player2.setPlayerName(scanner.nextLine());

        System.out.println("Player 1 will start.");
        System.out.println("Press ENTER to roll the dice.");
        scanner.nextLine();
    }

    public void playGame() {

    }

    public void displayRules() {
        System.out.println("Get 40 or more points to win the game");
    }

    public void playerTurn(Player player, Cup cup) {

    }

    public void displayScoreboard() {

    }
}
