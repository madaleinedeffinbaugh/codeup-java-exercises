package grades;

import util.Input;

import java.util.HashMap;
import java.util.Set;

public class GradesApplication {
    private static HashMap<String, Student> students = new HashMap<>();
    private static Input input = new Input();
    public static void main(String[] args) {

        createStudents();
        Set<String> usernames = students.keySet();

        openingPrompt(usernames);
        mainPrompt();
    }

    public static void createStudents() {
        Student student1 = new Student("John");
        student1.addGrade(80);
        student1.addGrade(100);
        student1.addGrade(90);

        Student student2 = new Student("Jane");
        student2.addGrade(85);
        student2.addGrade(70);
        student2.addGrade(98);

        Student student3 = new Student("Jack");
        student3.addGrade(50);
        student3.addGrade(100);
        student3.addGrade(75);

        Student student4 = new Student("Jill");
        student4.addGrade(60);
        student4.addGrade(70);
        student4.addGrade(55);

        students.put("dancing-monkey", student1);
        students.put("flying-saucer", student2);
        students.put("spinning-cat", student3);
        students.put("fluffy-dog", student4);
    }

    public static void openingPrompt(Set<String> usernames) {
        System.out.println("Welcome!\n\nHere are the GitHub usernames of our students:\n");
        for(String username : usernames) {
            System.out.printf("|%s| ", username);
        }
        System.out.println();
    }

    public static void mainPrompt(){
        boolean userContinue = true;
        do {
            System.out.println("\nWhat student would you like to see more information on?\n");
            String userInput = input.getString();
            if (students.containsKey(userInput)) {
                students.get(userInput).printInfo(userInput);
            } else {
                System.out.printf("\nSorry, no student found with the GitHub username of \"%s\"\n", userInput);
            }
            userContinue = input.yesNo("\nWould you like to see another student? y or yes to continue, anything else to stop.\n");
        }while(userContinue);
    }
}
