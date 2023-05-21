package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();

        Boolean confirm = true;
        do {
            Circle userCircle = new Circle(input.getDouble("\nPlease enter the radius: "));

            System.out.printf("The area of your circle is %.2f%n", userCircle.getArea());
            System.out.printf("The circumference of your circle is %.2f%n", userCircle.getCircumference());
            confirm = input.yesNo("\nEnter y or yes to enter another circle:");
        } while(confirm);


        System.out.println("\nTotal number of circles created: " + Circle.getCircles());


    }

}
