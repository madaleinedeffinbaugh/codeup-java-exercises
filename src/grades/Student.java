package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Double> grades;

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add((double) grade);
    }

    public double getGradeAverage() {
        Double sum = 0.0;
        for(Double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}
