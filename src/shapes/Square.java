package shapes;

public class Square extends Quadrilateral {
    private double side;
    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public double getArea() {
        return side * side;
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
