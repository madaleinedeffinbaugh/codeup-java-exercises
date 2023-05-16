public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println("ADD:");
        System.out.println(addNums(5,6));
        System.out.println(addNums(4,10));
        System.out.println("SUBTRACT:");
        System.out.println(subtractNums(10,3));
        System.out.println(subtractNums(7,12));
        System.out.println("MULTIPLY:");
        System.out.println(multiplyNums(5,5));
        System.out.println(multiplyNums(3,4));
        System.out.println(multiplyNums(5,0));
        System.out.println(multiplyNums(5,-5));
        System.out.println(multiplyNums(-3,4));
        System.out.println(multiplyNums(5,0));
        System.out.println("DIVIDE NUMS:");
        System.out.println(divideNums(12,3));
        System.out.println(divideNums(100,3));
        System.out.println(divideNums(3,0));
        System.out.println(divideNums(0,10));
        System.out.println("GET REMAINDER:");
        System.out.println(getRemainder(25,4));
        System.out.println(getRemainder(3,2));

    }

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
