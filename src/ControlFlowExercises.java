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
        for(int i = 1; i <= 100; i++) {
            if(i % 3 == 0 && i % 5== 0) {
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0) {
                System.out.println("Fizz");
            } else if(i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
