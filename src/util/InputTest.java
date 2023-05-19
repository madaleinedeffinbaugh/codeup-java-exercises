package util;

public class InputTest {

    public static void main(String[] args) {
        Input testingClass = new Input();

        System.out.println("Enter a string: ");
        testingClass.getString();

        System.out.println("Enter y or yes....or don't: ");
        testingClass.yesNo();

        System.out.println("Enter a range between 4 and 23: ");
        testingClass.getInt(4,23);

        System.out.println("Enter an Integer: ");
        testingClass.getInt();

        System.out.println("Enter a double between 3.9 and 4.6: ");
        testingClass.getDouble(3.9, 4.6);

        System.out.println("Enter a Double: ");
        testingClass.getDouble();

    }
}
