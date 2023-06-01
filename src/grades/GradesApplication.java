package grades;

import util.Input;

import java.util.HashMap;
import java.util.Set;

public class GradesApplication {
    private static HashMap<String, Student> students = new HashMap<>();
    public static void main(String[] args) {
        createStudents();
        Set<String> usernames = students.keySet();
        Input input = new Input();

        System.out.println("Welcome!\n\nHere are the GitHub usernames of our students:\n");
        for(String username : usernames) {
            System.out.printf("|%s| ", username);
        }
        System.out.println("\n\nWhat student would you like to see more information on?\n");
        String userInput = input.getString();
        if(students.containsKey(userInput)) {
            students.get(userInput).printInfo(userInput);
        } else {
            System.out.printf("\n\nSorry, no student found with the GitHub username of \"&s\"", userInput);
        }



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
}
