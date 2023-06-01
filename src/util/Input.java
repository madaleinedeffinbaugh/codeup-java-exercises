package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String userIn = scanner.nextLine();
        return userIn.equalsIgnoreCase("y") || userIn.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
            int userIn = getInt();
            while (userIn < min || userIn > max) {
                System.out.println("Number was not in range, try again:");

                userIn = getInt();
            }
            return userIn;
    }

    public int getInt() {
        try {
            return Integer.parseInt(getString());
        } catch (Exception e) {
            System.out.println("That was not an integer. Try again:");
            return getInt();
        }
    }

    public double getDouble(double min, double max) {
        double userIn = getDouble();
        while (userIn < min || userIn > max) {
            System.out.println("Number was not in range, try again:");
            userIn = getDouble();
        }
        return userIn;
    }

    public double getDouble() {
        try {
            return Double.parseDouble(getString());
        } catch (Exception e) {
            System.out.println("That was not a double. Try again: ");
            return getInt();
        }
    }


    //overloaded
    public String getString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String userIn = scanner.nextLine();
        return userIn.equalsIgnoreCase("y") || userIn.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
            int userIn = getInt();
            while (userIn < min || userIn > max) {
                System.out.println("Number was not in range, try again:");
                userIn = getInt();
            }
            return userIn;
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        return getInt();
    }

    public double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
            double userIn = getDouble();
            while (userIn < min || userIn > max) {
                System.out.println("Number was not in range, try again:");
                userIn = getDouble();
            }
            return userIn;
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return getDouble();
    }
}
