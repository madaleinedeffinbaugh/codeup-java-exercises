package util;
import java.util.Scanner;

public class Input {

    private Scanner scanner;

    Input() {
        scanner = new Scanner(System.in);
    }

    String getString() {
        return scanner.nextLine();
    }
    boolean yesNo() {
        String userIn = scanner.nextLine();
        return userIn.equalsIgnoreCase("y") || userIn.equalsIgnoreCase("yes");
    }
    int getInt(int min, int max) {
        int userIn = Integer.parseInt(scanner.nextLine());
        while (userIn < min || userIn > max) {
            System.out.println("Number was not in range, try again:");
            userIn = Integer.parseInt(scanner.nextLine());
        }
        return userIn;
    }
    int getInt() {
        return Integer.parseInt(scanner.nextLine());
    }
    double getDouble(double min, double max) {
        int userIn = Integer.parseInt(scanner.nextLine());
        while (userIn < min || userIn > max) {
            System.out.println("Number was not in range, try again:");
            userIn = Integer.parseInt(scanner.nextLine());
        }
        return userIn;
    }
    double getDouble() {
        return Double.parseDouble(scanner.nextLine());
    }




    String getString(String prompt) {
        System.out.println("Please enter a string: ");
        return scanner.nextLine();
    }
    boolean yesNo(String prompt) {
        System.out.println("Please enter a y or yes: ");
        String userIn = scanner.nextLine();
        return userIn.equalsIgnoreCase("y") || userIn.equalsIgnoreCase("yes");
    }
    int getInt(int min, int max,String prompt) {
        System.out.println("Please enter a value between " + min + " and " + max + ": ");
        int userIn = Integer.parseInt(scanner.nextLine());
        while (userIn < min || userIn > max) {
            System.out.println("Number was not in range, try again:");
            userIn = Integer.parseInt(scanner.nextLine());
        }
        return userIn;
    }
    int getInt(String prompt) {
        System.out.println("Please enter an integer: ");
        return Integer.parseInt(scanner.nextLine());
    }
    double getDouble(double min, double max,String prompt) {
        System.out.println("Please enter a value between " + min + " and " + max + ": ");
        int userIn = Integer.parseInt(scanner.nextLine());
        while (userIn < min || userIn > max) {
            System.out.println("Number was not in range, try again:");
            userIn = Integer.parseInt(scanner.nextLine());
        }
        return userIn;
    }
    double getDouble(String prompt) {
        System.out.println("Please enter a double:");
        return Double.parseDouble(scanner.nextLine());
    }
}
