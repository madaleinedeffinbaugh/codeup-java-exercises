import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.%n", pi);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer :)");
        try {
            int usersInt = scanner.nextInt();
            System.out.println(usersInt);
        }
        catch(InputMismatchException e) {
            System.out.println("Value entered was not an integer.");
        }
        catch(Exception e) {
            System.out.println("Something went wrong.");
        }

    }
}
