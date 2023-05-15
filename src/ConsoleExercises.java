import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        // EXERCISE 1
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.%n", pi);

        Scanner scanner = new Scanner(System.in);
        // adding this line will make the user have to hit enter between all three words
        // scanner.useDelimiter("\n");

        try {
            // EXERCISE 2
            //getting int from user
            System.out.println("Please enter an integer :)");
            int usersInt = scanner.nextInt();
            System.out.printf("Your integer: %d%n", usersInt);

            //getting three words from user
            System.out.println("Please enter three different words");
            String wordOne = scanner.next();
            String wordTwo = scanner.next();
            String wordThree = scanner.next();
            System.out.printf("Your words: %s, %s, %s%n", wordOne, wordTwo, wordThree);

            //getting sentence from user
            System.out.println("Please enter a sentence");
            scanner.nextLine();
            String userSentence = scanner.nextLine();
            System.out.printf("Your sentence: \n%s", userSentence);

            // EXERCISE 3
            //getting the length and width
            System.out.println("Time to calculate the perimeter and area of a room!");
            System.out.println("Please enter the length of the room: ");
            double length = scanner.nextDouble();
            System.out.println("Please enter the width of the room: ");
            double width = scanner.nextDouble();
            System.out.println("Please enter the height of the room: ");
            double height = scanner.nextDouble();

            // calculating results
            // area = length * width
            double area = length*width;
            System.out.printf("The area if the room is %.2f%n", area);

            // perimeter = length*2 + width*2
            double perimeter = (length*2) + (width*2);
            System.out.printf("The perimeter if the room is %.2f%n", perimeter);

            //volume = length * width * height
            double volume = length * height * width;
            System.out.printf("The volume if the room is %.2f", volume);


        }
        catch(InputMismatchException e) {
            System.out.println("Value entered was not of type specified.");
        }
        catch(Exception e) {
            System.out.println("Something went wrong.");
        }

    }
}


