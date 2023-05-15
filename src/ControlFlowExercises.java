import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        //Loop Basics

        // a. While
//        int i  = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

        //b. Do While
//        int i = 100;
//        do {
//            System.out.println(i);
//            i-=5;
//        } while (i >= -10);

//        long i = 2;
//        do {
//            System.out.println(i);
//            i = i * i;
//        } while(i <= 1000000);

        // c. For
        //a re-factored
//        for(int i = 5; i <=15; i++) {
//            System.out.println(i + " ");
//        }

        // first do-while on b re-factored
//        for(int i = 100; i >= -10; i -=5) {
//            System.out.println(i);
//        }

        // second do-while on b re-factored
//        for(long i = 2; i <= 1000000; i *= i) {
//            System.out.println(i);
//        }

        // 2. Fizzbuzz
//        for(int i = 1; i <= 100; i++) {
//            if(i % 3 == 0 && i % 5== 0) {
//                System.out.println("FizzBuzz");
//            } else if(i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if(i % 5 == 0) {
//                System.out.println("Buzz");
//            }
//            else {
//                System.out.println(i);
//            }
//        }

        //3. Display a table of powers
        Scanner scanner = new Scanner(System.in);
//        System.out.print("What number would you like to go up to? ");
//        int userNumber = scanner.nextInt();
//        System.out.println("\nHere is your table!\n");
//        System.out.printf("%-8s | %-8s | %-8s %n", "number", "squared", "cubed");
//        System.out.printf("%-8s | %-8s | %-8s %n", "------", "-------", "-----");
//        for(int i = 1; i <= userNumber; i++) {
//            System.out.printf("%-8d | %-8d | %-8d %n", i, i*i, i*i*i);
//        }

        // 4. Convert given number grades into letter grades
        String userAnswer;

        do {
            int userGrade = 0;
            String letterGrade;
            do {
                System.out.println("\nEnter a grade between 1-100:");
                userGrade = scanner.nextInt();
            } while ((userGrade < 1) || (userGrade > 100));

            if (userGrade >= 88) {
                letterGrade = "A";
            } else if (userGrade >= 80) {
                letterGrade = "B";
            } else if (userGrade >= 67) {
                letterGrade = "C";
            } else if (userGrade >= 60) {
                letterGrade = "D";
            } else {
                letterGrade = "F";
            }

            System.out.printf("Your grade of %d = %s", userGrade, letterGrade);


            System.out.println("\n\nDo you wish to input another grade? \nHit y and enter to continue. \nType anything else and hit enter to cancel.");
            userAnswer = scanner.next();
        } while (userAnswer.equals("y"));



    }
}
