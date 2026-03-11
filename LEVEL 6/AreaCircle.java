import java.util.*;

class Circle {
    int radius;

    public Circle() {
        this.radius = 5;
    }

    public double area() {

        return Math.PI * this.radius * this.radius;

    }
}

public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c1 = new Circle();
        c1.radius = sc.nextInt();
        double area = c1.area();
        System.out.println("area of circle :" + area);
    }
}
