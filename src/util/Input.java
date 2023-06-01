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
        try {
            int userIn = Integer.parseInt(scanner.nextLine());
            while (userIn < min || userIn > max) {
                System.out.println("Number was not in range, try again:");

                userIn = Integer.parseInt(scanner.nextLine());
            }
            return userIn;
        } catch (Exception e) {
            System.out.println("That was not an integer.");
            return getInt(min, max);
        }
    }

    public int getInt() {
        return Integer.parseInt(scanner.nextLine());
    }

    public double getDouble(double min, double max) {
        int userIn = Integer.parseInt(scanner.nextLine());
        while (userIn < min || userIn > max) {
            System.out.println("Number was not in range, try again:");
            userIn = Integer.parseInt(scanner.nextLine());
        }
        return userIn;
    }

    public double getDouble() {
        return Double.parseDouble(scanner.nextLine());
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
        try {
            int userIn = Integer.parseInt(scanner.nextLine());
            while (userIn < min || userIn > max) {
                System.out.println("Number was not in range, try again:");

                userIn = Integer.parseInt(scanner.nextLine());
            }
            return userIn;
        } catch (Exception e) {
            System.out.println("That was not an integer.");
            return getInt(min, max, prompt);
        }

    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("That was not an integer.");
            return getInt(prompt);
        }
    }

    public double getDouble(double min, double max, String prompt) {
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

    public double getDouble(String prompt) {
        System.out.println(prompt);
        try {
            return Double.parseDouble(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("That was not a number.");
            return getDouble(prompt);
        }
    }
}
