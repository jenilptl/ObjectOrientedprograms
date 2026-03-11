import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter operation (+, -, *, /): ");
        String op = sc.next();

        double result = 0;

        switch (op) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> {
                if (num2 != 0)
                    result = num1 / num2;
                else
                    System.out.println("Cannot divide by zero!");
            }
            default -> System.out.println("Invalid operator");
        }

        System.out.println("Result: " + result);
    }
}
