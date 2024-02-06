package exercise1;

import java.util.Random;
import java.util.Scanner;

public class CardTrick {

    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static Random random = new Random(); // Instantiating the Random object
    private static Scanner scanner = new Scanner(System.in); // Instantiating the Scanner object

    public static void main(String[] args) {

        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            int value = random.nextInt(13) + 1; // Values 1-13 (1=Ace, 11=Jack, 12=Queen, 13=King)
            String suit = SUITS[random.nextInt(4)]; // Assuming Card.SUITS is a String[] {"Hearts", "Diamonds", "Clubs", "Spades"}
            hand[i] = new Card(value, suit); // Assuming a constructor that accepts value and suit
        }

        System.out.println("Pick a card value (1=Ace, 11=Jack, 12=Queen, 13=King):");
        int userValue = scanner.nextInt();
        System.out.println("Pick a suit (0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades):");
        int suitIndex = scanner.nextInt();
        String userSuit = SUITS[suitIndex];

        boolean found = false;
        for (Card card : hand) {
            if (card.getValue() == userValue && card.getSuit().equalsIgnoreCase(userSuit)) {
                found = true;
                break;
            }
        }

        if (found) {
            printInfo();
        } else {
            System.out.println("Sorry, your card was not in the hand.");
        }

        scanner.close(); // Close the scanner
    }

    private static void printInfo() {
        System.out.println("Congratulations, you guessed right!");
        System.out.println();

        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();

        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
        System.out.println();

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Playing");
        System.out.println("-- Watching TV");
        System.out.println("-- Dancing");

        System.out.println();
    }
}
