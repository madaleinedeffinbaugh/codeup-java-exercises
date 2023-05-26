package shapes;

public class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

//    private double side;
//
//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    @Override
//    public double getArea() {
////        System.out.println("This is the override method");
//        return side * side;
//    }
//
//    @Override
//    public double getPerimeter() {
////        System.out.println("This is the override method");
//        return 4 * side;
//    }
}
