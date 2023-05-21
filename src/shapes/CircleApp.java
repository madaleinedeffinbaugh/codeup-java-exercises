package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();

        Circle userCircle = new Circle(input.getDouble("Please enter the radius: "));

        System.out.printf("The area of your circle is %.2f%n", userCircle.getArea());
        System.out.printf("The circumference of your circle is %.2f%n", userCircle.getCircumference());
        System.out.println(Circle.getCircles());


    }

}
