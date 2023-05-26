package movies;

import util.Input;

import static movies.MoviesArray.findAll;

public class MoviesApplication {
    private static final Input input = new Input();

    public static void main(String[] args) {

        while (true) {
            displayMenu();
            int choice = input.getInt(0, 5);
            if (choice == 0) {
                break;
            } else {
                performSelection(choice);
            }
        }


    }

    private static void displayMenu() {
        System.out.println("What would you like to do?\n");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("1 - view movies in the animated category");
        System.out.println("2 - view movies in the drama category");
        System.out.println("3 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category\n");
        System.out.print("Enter your choice: ");

    }

    public static void performSelection(int choice) {
        switch (choice) {
            case 1 -> displayMovies("all");
            case 2 -> displayMovies("animated");
            case 3 -> displayMovies("drama");
            case 4 -> displayMovies("horror");
            case 5 -> displayMovies("scifi");
        }
    }

    public static void displayMovies(String cat) {
        for (Movie movie : findAll()) {
            if (movie.getCategory().equalsIgnoreCase(cat) || cat.equalsIgnoreCase("all")) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }
}
