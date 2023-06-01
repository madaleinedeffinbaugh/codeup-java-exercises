package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

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
