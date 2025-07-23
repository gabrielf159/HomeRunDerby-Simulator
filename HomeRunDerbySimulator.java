
/**
 * Homerun derby simulator
 *
 * Gabriel Flores
 * 12/14/18
 */

import java.util.Random;
import java.util.Scanner;

public class HomerunDerby {

    // Constants for bat sizes
    static final int SMALL_BAT = 31;
    static final int MEDIUM_BAT = 32;
    static final int LARGE_BAT = 33;

    static Scanner scanner = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        // Welcome message and player setup
        System.out.println("  *** Welcome to the Show's Annual Home Run Derby! ***");
        System.out.print("Enter your name: ");
        String player = scanner.nextLine();

        // Bat size selection
        System.out.println(player + ", your opponent today is Handsome Ron.");
        System.out.print("Choose your bat size (31, 32, or 33 inches): ");
        int batSize = scanner.nextInt();

        // Coin toss to determine who bats first
        System.out.println("Flipping a coin to decide who bats first...");
        pause();

        boolean youGoFirst = rand.nextBoolean(); // true = player goes first
        System.out.println("Coin flip result: " + (youGoFirst ? "Heads! You bat first!" : "Tails! Ron bats first!"));
        pause();

        // Score tracking
        int yourScore = 0;
        int ronScore = 0;

        // Game flow based on coin flip
        if (youGoFirst) {
            System.out.println("You're up to bat!");
            yourScore = performBatting(batSize, true); // player's turn

            System.out.println("Now Handsome Ron takes the plate...");
            ronScore = performBatting(0, false);       // Ron's turn
        } else {
            System.out.println("Handsome Ron bats first!");
            ronScore = performBatting(0, false);       // Ron's turn

            System.out.println("Now it's your turn!");
            yourScore = performBatting(batSize, true); // player's turn
        }

        // Final results
        System.out.println("\n--- Final Score ---");
        System.out.println(player + ": " + yourScore);
        System.out.println("Handsome Ron: " + ronScore);

        // Winner announcement
        if (yourScore > ronScore) {
            System.out.println("You are the winner! Come back next year to defend your title.");
        } else if (ronScore > yourScore) {
            System.out.println("Handsome Ron says: 'Sorry pal, maybe next time.'");
        } else {
            System.out.println("It's a tie! What a showdown!");
        }
    }

    /**
     * Simulates a batting round for 10 pitches.
     * Calculates random distances based on bat size or Ron’s preset range.
     */
    public static int performBatting(int batSize, boolean isPlayer) {
        int min, max;

        if (!isPlayer) {
            // Handsome Ron always uses fixed power values
            min = 305;
            max = 505;
        } else if (batSize == SMALL_BAT) {
            System.out.println("31\" bat selected – smaller than usual.");
            min = 55; max = 475;
        } else if (batSize == MEDIUM_BAT) {
            System.out.println("32\" bat selected – perfect size.");
            min = 155; max = 555;
        } else if (batSize == LARGE_BAT) {
            System.out.println("33\" bat selected – might be a little heavy.");
            min = 145; max = 525;
        } else {
            // Fallback if bat size is invalid
            System.out.println("Invalid bat size, defaulting to 32\".");
            min = 155; max = 555;
        }

        pause();

        int score = 0;
        for (int i = 1; i <= 10; i++) {
            // Generate a random hit distance between min and max
            int distance = Math.max(min, Math.min((int)(Math.random() * 1000), max));
            System.out.println("Hit " + i + ": " + distance + " ft.");

            // Display hit outcome
            if (distance <= 30) {
                System.out.println("Foul!");
            } else if (distance < 450) {
                System.out.println("Not a home run.");
            } else {
                System.out.println("Home Run!");
                score++;
            }
        }

        return score;
    }

    /**
     * Pauses the game and waits for user input to continue.
     */
    public static void pause() {
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
        if (scanner.hasNextLine()) scanner.nextLine();
    }
}
