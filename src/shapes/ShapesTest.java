package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(4, 5);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());

        Measurable myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        Measurable myShape2 = new Rectangle(5,4);
        System.out.println(myShape2.getArea());
        System.out.println(myShape2.getPerimeter());

//        Answer the following questions:
//        9. Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
//              -because it needs override the method that is supposed to be implemented
//        10. What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
//              -they don't exist because the variable was declared as datatype Measurable, which does not
//              have those methods. if you were to declare it as Rectangle, you can access those methods
    }
}
