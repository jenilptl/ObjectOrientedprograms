import java.util.Scanner;

public class StudentDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks of subject " + i + ": ");
            int marks = sc.nextInt();
            total += marks;
        }

        double percentage = total / 5.0;

        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 60)
            System.out.println("First Division");
        else if (percentage >= 50)
            System.out.println("Second Division");
        else if (percentage >= 40)
            System.out.println("Third Division");
        else
            System.out.println("Fail");
    }
}
