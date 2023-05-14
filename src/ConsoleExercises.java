import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        // EXERCISE 1
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f.%n", pi);
//
//        // EXERCISE 2
        Scanner scanner = new Scanner(System.in);
//
//        try {
//            //getting int from user
//            System.out.println("Please enter an integer :)");
//            int usersInt = scanner.nextInt();
//            System.out.printf("Your integer: %d%n", usersInt);
//
//            //getting three words from user
//            System.out.println("Please enter three different words");
//            String wordOne = scanner.next();
//            String wordTwo = scanner.next();
//            String wordThree = scanner.next();
//            System.out.printf("Your words: %s, %s, %s%n", wordOne, wordTwo, wordThree);
//
//            //getting sentence from user
//            System.out.println("Please enter a sentence");
//            scanner.nextLine();
//            String userSentence = scanner.nextLine();
//            System.out.printf("Your sentence: \n%s", userSentence);
//
//        }
//        catch(InputMismatchException e) {
//            System.out.println("Value entered was not of type specified.");
//        }
//        catch(Exception e) {
//            System.out.println("Something went wrong.");
//        }

        // EXERCISE 3
        try {
            //getting the length and width
            System.out.println("Time to calculate the perimeter and area of a room!");
            System.out.println("Please enter the length of the room: ");
            double length = Double.parseDouble(scanner.nextLine());
            System.out.println("Please enter the width of the room: ");
            double width = Double.parseDouble(scanner.nextLine());

            // calculating result
            // area = length * width
            double area = length*width;
            System.out.printf("The area if the room is %.2f%n", area);

            // perimeter = length*2 + width*2
            double perimeter = (length*2) + (width*2);
            System.out.printf("The perimeter if the room is %.2f", perimeter);
        }
        catch(NumberFormatException e) {
            System.out.println("Value entered was not correct.");
        }
        catch(Exception e) {
            System.out.println("Something went wrong.");
        }


    }
}
