package grades;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student("John");
        student1.addGrade(80);
        student1.addGrade(100);
        student1.addGrade(90);
        System.out.println(student1.getGradeAverage());

        Student student2 = new Student("Jane");
        student2.addGrade(85);
        student2.addGrade(70);
        student2.addGrade(98);
        System.out.println(student2.getGradeAverage());
    }
}
