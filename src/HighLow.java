import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String userConfirm;

        //I created the range 1-100 and the maxGuesses as parameters/arguments so that they can be changed easily.
        // Maybe a game where it also randomly generates the range....
        do {
            gamePlay(1, 100, 10);
            System.out.println("Press Q to quit. Enter anything else to play again.");
            userConfirm = scanner.nextLine();
        } while (!userConfirm.equalsIgnoreCase("q"));

    }

    public static void gamePlay(int bottomRange, int topRange, int maxGuess) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(topRange - (bottomRange - 1)) + bottomRange;
        System.out.println("CHEAT NUMBER = " + randomNumber);
        int numOfGuesses = 0;
        while (true) {
            int userGuess = getGuess(bottomRange, topRange);
            numOfGuesses++;
            if (checkGuess(randomNumber, userGuess) || numOfGuesses >= maxGuess) {
                break;
            }
            displayGuessesLeft(numOfGuesses, maxGuess);
        }
    }

    public static int getGuess(int bottomRange, int topRange) {
        int userGuess = 0;
        try {
            System.out.println("\n\nPlease guess a number between " + bottomRange + " and " + topRange + ":");
            userGuess = Integer.parseInt(scanner.nextLine());
            if (userGuess < bottomRange || userGuess > topRange) {
                System.out.println("Number not in range, try again.");
                return getGuess(bottomRange, topRange);
            }
        } catch (NumberFormatException e) {
            System.out.println("That is not a number, try again.");
        }

        return userGuess;
    }

    public static boolean checkGuess(int correctAnswer, int userGuess) {
        if (userGuess == correctAnswer) {
            System.out.println("GOOD GUESS!");
            System.out.println("YOU WIN!");
            return true;
        } else if (userGuess > correctAnswer) {
            System.out.println("TOO HIGH");
        } else {
            System.out.println("TOO LOW");
        }
        return false;
    }

    public static void displayGuessesLeft(int numOfGuesses, int maxGuesses) {
        if (numOfGuesses < maxGuesses) {
            System.out.println("You have " + (maxGuesses - numOfGuesses) + " guesses left.");
        } else if (maxGuesses - numOfGuesses == 1) {
            System.out.println("You have " + (maxGuesses - numOfGuesses) + " guess left.");
        } else {
            System.out.println("You are out of guesses! You lose!");
        }
    }

}
