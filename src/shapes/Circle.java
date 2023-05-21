package shapes;
public class Circle {

    private double radius;
    private static int circles;

    public Circle(double radius) {
        this.radius = radius;
        addCircle();
    }
    public double getArea() {
        return Math.PI * (radius * radius);
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void addCircle() {
        circles += 1;
    }

    public static int getCircles() {
        return circles;
    }
}
