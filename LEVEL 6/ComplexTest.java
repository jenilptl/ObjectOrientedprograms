class Complex {
    double real;
    double imaginary;
    Complex() {
        real = 0;
        imaginary = 0;
    }
    Complex(double r, double i) {
        real = r;
        imaginary = i;
    }
    Complex(int r) {
        real = r;
        imaginary = 0;
    }
    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imaginary + c.imaginary);
    }
    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class ComplexTest {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex(3.5, 4.5);
        Complex c3 = new Complex(5);

        Complex result = c2.add(c3);

        System.out.print("c1 = "); c1.display();
        System.out.print("c2 = "); c2.display();
        System.out.print("c3 = "); c3.display();
        System.out.print("c2 + c3 = "); result.display();
    }
}
