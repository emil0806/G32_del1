package game;

import java.util.Scanner;

public class Game {
    private Player player1 = new Player("", 0);
    private Player player2 = new Player("", 0);
    private Cup cup = new Cup();
    private int turnCount = 0;
    private int coinFlip = (int) Math.floor(Math.random() * (2 - 1 + 1) + 1);

    private Scanner scanner = new java.util.Scanner(System.in);

    public void startGame() {
        System.out.println("");

        System.out.println("Welcome to the best dice game in the World!");
        System.out.println("");

        displayRules();

        System.out.println("Press ENTER to start the game");
        scanner.nextLine();

        System.out.print("Please enter player 1 name: ");
        player1.setPlayerName(scanner.nextLine());

        System.out.print("Please enter player 2 name: ");
        player2.setPlayerName(scanner.nextLine());

        if (coinFlip == 1) {
            System.out.println(player1.getPlayerName() + " won the coin flip.");
            playGame(player1, player2);
        } else {
            System.out.println(player2.getPlayerName() + " won the coin flip.");
            playGame(player2, player1);
        }
    }

    public void playGame(Player player1, Player player2) {
        while ((player1.getScore() < 40 || player2.getScore() < 40)
                || (cup.getDie1() != cup.getDie2() || cup.getRollSum() == 2)) {
            if (turnCount % 2 == 0) {
                System.out.println(player1.getPlayerName() + ", press ENTER to roll dice");
                scanner.nextLine();
                playerTurn(player1, cup);
            } else {
                System.out.println(player2.getPlayerName() + ", press ENTER to roll dice");
                scanner.nextLine();
                playerTurn(player2, cup);
            }
        }
    }

    public void displayRules() {
        System.out.println("Get 40 or more points to win the game");
        System.out.println("1) A player loses all his point if the player rolls double ones (snake eyes)");
        System.out.println("2) A player gets an extra turn if the player rolls two of a kind, not double ones");
        System.out.println("3) A player can win the game by rolling double sixes two times in a row");
        System.out.println("4) A player has to roll two of a kind when or after achieving 40 point to win the game");
    }

    public void playerTurn(Player player, Cup cup) {
        cup.setRollSum();

        System.out.println("Die 1: " + cup.getDie1());
        System.out.println("Die 2: " + cup.getDie2());
        System.out.println("The sum of the two dice: " + cup.getRollSum());

        if (cup.getRollSum() == 2) {
            doubleOnes(player);
        } else if (cup.getDie1() == cup.getDie2()) {
            extraTurn(player, cup);
        } else {
            player.setScore(cup.getRollSum());
        }

        displayScoreboard();

        player.setLastRoll(cup.getRollSum());

        turnCount++;

        if (cup.getDie1() == cup.getDie2()) {
            if (player.getScore() >= 40) {
                System.out.println("Congratz, " + player.getPlayerName() + " won the game!");
                System.exit(0);
            }
        }
    }

    public void displayScoreboard() {
        System.out.println(player1.getPlayerName() + ": " + player1.getScore());
        System.out.println(player2.getPlayerName() + ": " + player2.getScore());
    }

    public void doubleOnes(Player player) {
        System.out.println("Oh no - you lost all your points.");
        player.resetScore();
    }

    public void extraTurn(Player player, Cup cup) {
        player.setScore(cup.getRollSum());

        if (cup.getRollSum() == 12) {
            sixesInARow(player, cup);
        }
        if (player.getScore() < 40) {
            System.out.println("Two of a kind, you get a extra turn");
        }

        turnCount -= 1;
    }

    public void sixesInARow(Player player, Cup cup) {
        if (player.getLastRoll() == cup.getRollSum()) {
            System.out.println("Double sixes, you are a lucky star!");
            System.out.println("Congratz, " + player.getPlayerName() + " won the game!");
            System.exit(0);
        }
    }
}
