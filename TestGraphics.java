import Graphics.*;

public class TestGraphics {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(10, 5);
        Square s = new Square(4);
        Circle c = new Circle(3);
        Triangle t = new Triangle(6, 8);

        System.out.println("Area of Rectangle: " + r.area());
        System.out.println("Area of Square: " + s.area());
        System.out.println("Area of Circle: " + c.area());
        System.out.println("Area of Triangle: " + t.area());
    }
}