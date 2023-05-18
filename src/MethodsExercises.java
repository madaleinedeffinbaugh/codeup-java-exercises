import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //#1
        System.out.println("#1 - MATH METHODS");
        System.out.println("ADD:");
        System.out.println("5 + 6 = " +addNums(5,6));
        System.out.println("4.2 + 10.3 = " + addNums(4.2,10.3));
        System.out.println("\nSUBTRACT:");
        System.out.println("10 - 3 = " + subtractNums(10,3));
        System.out.println("7 + 12.2 = " + subtractNums(7,12.2));
        System.out.println("\nMULTIPLY:");
        System.out.println("5 x 5 = " + multiplyNums(5,5));
        System.out.println("3 x 4 = " + multiplyNums(3,4));
        System.out.println("5 x 0 = " + multiplyNums(5,0));
        System.out.println("5 x -5 = " + multiplyNums(5,-5));
        System.out.println("-3 x 4 = " + multiplyNums(-3,4));
        System.out.println("-12 x -2 = " + multiplyNums(-12,-2));
        System.out.println("\nDIVIDE NUMS:");
        System.out.println("12 / 3 = " + divideNums(12,3));
        System.out.println("100 / 3 = " + divideNums(100,3));
        System.out.println("3 / 0 = " + divideNums(3,0));
        System.out.println("0 / 10 = " + divideNums(0,10));
        System.out.println("\nGET REMAINDER:");
        System.out.println("25 % 4 = " + getRemainder(25,4));
        System.out.println("3 % 2 = " + getRemainder(3,2));

        //#2
        System.out.println("\n\n#2 - CHECK RANGE");
        System.out.println("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        System.out.printf("Your correct input: %d%n%n", userInput);

        System.out.println("Enter a number between 23 and 48: ");
        int userInput2 = getInteger(23, 48);
        System.out.printf("Your correct input: %d", userInput2);

        //#3
        System.out.println("\n\n#3 - CALCULATE A FACTORIAL");
        factorialPrompt();

        //4
        System.out.println("\n\n#4 - ROLL SOME DICE");
        rollDice();



    }

    //maths
    public static double addNums(double numOne, double numTwo) {
        return numOne + numTwo;
    }
    public static double subtractNums(double numOne, double numTwo) {
        return numOne - numTwo;
    }
    //second attempt, the first one is at the bottoms
    public static double multiplyNums(double x, double y) {
        if(x < 0 && y < 0) {
            x = Math.abs(x);
            y = Math.abs(y);
        } else if (x > 0 && y < 0) {
            x = -x;
            y = Math.abs(y);
        }
        if(x==0 ||y ==0){
            return 0;
        }
        else if(y != 0) {
            return (x + multiplyNums(x, y - 1));
        }
        else {
            return -x + multiplyNums(x,y+1);

        }
    }
    public static double divideNums(double numOne, double numTwo) {
        if (numTwo == 0) {
            return 0;
        }
        return numOne / numTwo;
    }
    public static double getRemainder(double numOne, double numTwo) {
        return numOne % numTwo;
    }

    //get int in specific range
    public static int getInteger(int min, int max) {
       int userIn = Integer.parseInt(scanner.nextLine());
       if(userIn < min || userIn > max) {
           System.out.println("Number was not in range, try again:");
           return getInteger(min, max);
       } else {
           return userIn;
       }

    }

    //factorial methods
    public static void factorialPrompt() {
        System.out.println("Please enter a number 1-12");
        int userInput = getInteger(1,12);
        System.out.printf("!%d = %s = %d%n", userInput, factorialDisplay(userInput), factorial(userInput));
        System.out.println("\nDo you want to calculate another? y/n");
        String userConfirm = scanner.nextLine();
        while (!userConfirm.equalsIgnoreCase("y") && !userConfirm.equalsIgnoreCase("n")) {
            System.out.println("Invalid choice");
            System.out.println("Do you want to calculate another? y/n");
            userConfirm = scanner.nextLine();
        }
        if(userConfirm.equalsIgnoreCase("y")) {
            factorialPrompt();
        } else {
            System.out.println("Moving on...");
        }
    }
    public static String factorialDisplay(int x) {
        String result = "";
        if(x - 1 == 0) {
            return result + x;
        } else {
            return String.format("%s x %d", factorialDisplay(x-1), x);
        }
    }
    public static int factorial(int x) {
        if(x - 1 == 0) {
           return x;
        } else {
            return x * factorial(x -1);
        }

    }

    //dice rolling
    public static void rollDice() {
        System.out.println("Please enter a number of sides for the dice");
        int numSides = scanner.nextInt();
        Random random = new Random();
        int rand_int1 = random.nextInt(numSides)+1;
        int rand_int2 = random.nextInt(numSides) +1;
        System.out.printf("Dice 1: %d, Dice 2: %d", rand_int1, rand_int2);
        scanner.nextLine();
        System.out.println("\nDo you want to play again? y/n");
        String userConfirm = scanner.nextLine();
        while (!userConfirm.equalsIgnoreCase("y") && !userConfirm.equalsIgnoreCase("n")) {
            System.out.println("Invalid choice");
            System.out.println("Do you want to play again? y/n");
            userConfirm = scanner.nextLine();
        }
        if(userConfirm.equalsIgnoreCase("y")) {
            rollDice();
        } else {
            System.out.println("Goodbye...");
        }


    }






//first attempt for the multiply nums one, this one required a accumulator so i didnt like it.
//        public static double multiplyNums(double numOne, double numTwo) {
//        if(numOne < 0 && numTwo < 0) {
//            numOne = Math.abs(numOne);
//            numTwo = Math.abs(numTwo);
//        } else if (numOne > 0 && numTwo < 0) {
//            numOne = -numOne;
//            numTwo = Math.abs(numTwo);
//        }
//        if(numTwo == 0 || numOne == 0) {
//            return 0;
//        } else if(numTwo >= 1) {
//            return multiplyNums(numOne, numTwo -1, numOne);
//        } else {
//            return numOne;
//        }
//    }
//
//    public static double multiplyNums(double numOne, double numTwo, double result) {
//        if(numTwo >= 1) {
//            return multiplyNums(numOne, numTwo -1, result + numOne);
//        } else {
//            return result;
//        }
//    }
}
