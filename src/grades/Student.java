package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Double> grades;

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }
}
