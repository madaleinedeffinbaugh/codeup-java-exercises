import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.%n", pi);

        Scanner scanner = new Scanner(System.in);

        try {
            //getting int from user
            System.out.println("Please enter an integer :)");
            int usersInt = scanner.nextInt();
            System.out.printf("Your integer: %d", usersInt);

            //getting three words from user
            System.out.println("Please enter three different words");
            String wordOne = scanner.next();
            String wordTwo = scanner.next();
            String wordThree = scanner.next();
            System.out.printf("one- %s, two- %s, three- %s", wordOne, wordTwo, wordThree);

        }
        catch(InputMismatchException e) {
            System.out.println("Value entered was not of type specified.");
        }
        catch(Exception e) {
            System.out.println("Something went wrong.");
        }

    }
}
