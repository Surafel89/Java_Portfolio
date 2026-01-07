package main;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static String[] choices = {"R", "P", "S"};
    static String userChoice;
    static String computerChoice;

    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        while (true) {
            System.out.print("Choose R for Rock, P for Paper, or S for Scissors: ");
            userChoice = scanner.nextLine().trim().toUpperCase();

            if (userChoice.equals("R") || userChoice.equals("P") || userChoice.equals("S")) {
                System.out.println("You chose: " + userChoice);
                break;
            } else {
                System.out.println("Invalid input! Please try again.");
            }
        }

        // Computer randomly selects
        Random rand = new Random();
        computerChoice = choices[rand.nextInt(choices.length)];
        System.out.println("Computer chose: " + computerChoice);

        // Determine winner
        determineWinner();

        scanner.close();
    }

    public static void determineWinner() {
        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a draw!");
        } else if (
            (userChoice.equals("R") && computerChoice.equals("S")) ||
            (userChoice.equals("P") && computerChoice.equals("R")) ||
            (userChoice.equals("S") && computerChoice.equals("P"))
        ) {
            System.out.println("🎉 Congratulations! You won!");
        } else {
            System.out.println("💻 Computer wins this round!");
        }
    }
}

