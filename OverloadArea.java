import java.util.Scanner;

class Area {

   
    double calculate(double radius) {
        return 3.14 * radius * radius;
    }

    double calculate(double length, double breadth) {
        return length * breadth;
    }

    
    double calculate(float base, float height) {
        return 0.5 * base * height;
    }

    
    double calculate(int side) {
        return side * side;
    }
}

public class OverloadArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area obj = new Area();

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        System.out.println("Area of Circle: " + obj.calculate(r));

     
        System.out.print("\nEnter length and breadth of rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Area of Rectangle: " + obj.calculate(l, b));

    
        System.out.print("\nEnter base and height of triangle: ");
        float base = sc.nextFloat();
        float height = sc.nextFloat();
        System.out.println("Area of Triangle: " + obj.calculate(base, height));

       
        System.out.print("\nEnter side of square: ");
        int side = sc.nextInt();
        System.out.println("Area of Square: " + obj.calculate(side));

        sc.close();
    }
}