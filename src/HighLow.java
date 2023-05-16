import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        String userConfirm;

        do {
            int randomNumber = rand.nextInt(100) + 1;
            int userGuess = 0;
            int numOfGuesses = 0;
            do {
                do {
                    try {
                        System.out.println("\n\nPlease guess a number between 1 and 100:");
                        userGuess = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("That is not a number, try again.");
                    }
                } while(userGuess < 1 || userGuess > 100);

                numOfGuesses++;

                if(userGuess == randomNumber) {
                    System.out.println("GOOD GUESS!");
                    System.out.println("YOU WIN!");
                } else if (userGuess > randomNumber) {
                    if(numOfGuesses == 10) {
                        System.out.println("You are too high, and out of guesses! You lose");
                        break;
                    } else if(numOfGuesses == 9) {
                        System.out.println("LOWER");
                        System.out.printf("You have %d guess remaining.", 10-numOfGuesses);
                    }
                    else {
                        System.out.println("LOWER");
                        System.out.printf("You have %d guesses remaining.", 10-numOfGuesses);
                    }

                } else {
                    if(numOfGuesses == 10) {
                        System.out.println("You are too low, and out of guesses! You lose");
                        break;
                    } else if(numOfGuesses == 9) {
                        System.out.println("HIGHER");
                        System.out.printf("You have %d guess remaining.", 10-numOfGuesses);
                    } else {
                        System.out.println("HIGHER");
                        System.out.printf("You have %d guesses remaining.", 10-numOfGuesses);
                    }
                }

            } while(userGuess != randomNumber);

            System.out.println("Press Q to quit. Enter anything else to play again.");
            userConfirm = scanner.nextLine();
        } while(!userConfirm.equalsIgnoreCase("q"));

    }

}
