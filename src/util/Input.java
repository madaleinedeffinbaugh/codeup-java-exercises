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


    //overloaded
    String getString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    boolean yesNo(String prompt) {
        System.out.println(prompt);
        String userIn = scanner.nextLine();
        return userIn.equalsIgnoreCase("y") || userIn.equalsIgnoreCase("yes");
    }

    int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
        int userIn = 0;
        try {
            userIn = Integer.parseInt(scanner.nextLine());
            while (userIn < min || userIn > max) {
                System.out.println("Number was not in range, try again:");

                userIn = Integer.parseInt(scanner.nextLine());
            }
            return userIn;
        } catch (Exception e) {
            System.out.println("That was not a number.");
            return getInt(min, max, prompt);
        }

    }

    int getInt(String prompt) {
        System.out.println(prompt);
        int userInt = 0;
        try {
            userInt = Integer.parseInt(scanner.nextLine());
            return userInt;
        } catch (Exception e) {
            System.out.println("That was not a number.");
            return getInt(prompt);
        }
    }

    double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        try {
            double userIn = Double.parseDouble(scanner.nextLine());
            while (userIn < min || userIn > max) {
                System.out.println("Number was not in range, try again:");

                userIn = Double.parseDouble(scanner.nextLine());
            }
            return userIn;
        } catch (Exception e) {
            System.out.println("That was not a number.");
            return getDouble(min, max, prompt);
        }
    }

    double getDouble(String prompt) {
        System.out.println(prompt);
        try {
            return Double.parseDouble(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("That was not a number.");
            return getDouble(prompt);
        }
    }
}
