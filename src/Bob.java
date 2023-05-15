import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userQuit = "r";

        do {
            System.out.println("Say something to Bob: ");
            String userInput = scanner.nextLine();
            String bobsResponse;

            if(userInput.endsWith("?")) {
                bobsResponse = "Sure.";
            } else if (userInput.endsWith("!")) {
                bobsResponse = "Whoa, chill out!";
            } else if (userInput.isEmpty()) {
                bobsResponse = "Fine. Be that way!";
            } else {
                bobsResponse = "Whatever";
            }

            System.out.println("Bob says: \n" + bobsResponse);
            System.out.println("\nPress Q to quit. Press anything else to continue talking");
            userQuit = scanner.nextLine();


        } while (!userQuit.equalsIgnoreCase("q"));

        System.out.println("Nice talking to you, don't come again!");
    }
}
