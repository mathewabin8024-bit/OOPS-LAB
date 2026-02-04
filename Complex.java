import java.util.Scanner;

class Complex {
    double real;
    double imag;

    // Constructor
    Complex(double r, double i) {
        real = r;
        imag = i;
    }

    // Method to add two complex numbers
    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    // Method to display complex number
    void display() {
        if (imag >= 0)
            System.out.println(real + " + " + imag + "i");
        else
            System.out.println(real + " - " + (-imag) + "i");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First complex number
        System.out.println("First complex number:");
        System.out.print("Real part: ");
        double r1 = sc.nextDouble();

        System.out.print("Imaginary part (like 2i): ");
        String i1Str = sc.next();
        double i1 = Double.parseDouble(i1Str.replace("i", ""));

        Complex c1 = new Complex(r1, i1);

        // Second complex number
        System.out.println("\nSecond complex number:");
        System.out.print("Real part: ");
        double r2 = sc.nextDouble();

        System.out.print("Imaginary part (like 5i): ");
        String i2Str = sc.next();
        double i2 = Double.parseDouble(i2Str.replace("i", ""));

        Complex c2 = new Complex(r2, i2);

        // Addition
        Complex sum = c1.add(c2);

        // Display result
        System.out.print("\nSum of complex numbers: ");
        sum.display();

        sc.close();
    }
}