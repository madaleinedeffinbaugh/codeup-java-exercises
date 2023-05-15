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
        long i = 2;
        do {
            System.out.println(i);
            i = i * i;
        } while(i <= 1000000);
    }
}
