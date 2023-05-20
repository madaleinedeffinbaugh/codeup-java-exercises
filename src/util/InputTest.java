package util;

public class InputTest {

    public static void main(String[] args) {
        Input testingClass = new Input();
//
//        System.out.println("Enter a string: ");
//        System.out.println(testingClass.getString());
//
//        System.out.println("Enter y or yes....or don't: ");
//        System.out.println( testingClass.yesNo());
//
//        System.out.println("Enter a range between 4 and 23: ");
//        System.out.println(testingClass.getInt(4,23));
//
//        System.out.println("Enter an Integer: ");
//        System.out.println(testingClass.getInt());
//
//        System.out.println("Enter a double between 3.9 and 4.6: ");
//        System.out.println(testingClass.getDouble(3.9, 4.6));
//
//        System.out.println("Enter a Double: ");
//        System.out.println(testingClass.getDouble());

        System.out.println(testingClass.getString("Please enter a string: "));

        System.out.println(testingClass.yesNo("Please enter a y or yes: "));

        System.out.println(testingClass.getInt(4,23,"Please enter a value between 4 and 23: "));

        System.out.println(testingClass.getInt("Please enter an integer: "));

        System.out.println(testingClass.getDouble(3.9, 4.6, "Please enter a value between 3.9 and 4.6: "));

        System.out.println(testingClass.getDouble("Please enter a double:"));

    }
}
