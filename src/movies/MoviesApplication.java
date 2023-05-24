package movies;

import util.Input;

public class MoviesApplication {
    private static final Input input = new Input();

    public static void main(String[] args) {
        displayMenu();
        int choice = input.getInt(0,5);
        System.out.println(choice);

    }

    private static void displayMenu(){
        System.out.println("What would you like to do?\n");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("1 - view movies in the animated category");
        System.out.println("2 - view movies in the drama category");
        System.out.println("3 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category\n");
        System.out.print("Enter your choice: ");

    }
}
