class Student {
    int id_no;
    int no_of_subjects_registered;
    String[] subject_code;
    int[] subject_credits;
    String[] grade_obtained;
    double spi;

    Student(int id, int n, String[] codes, int[] credits, String[] grades) {
        id_no = id;
        no_of_subjects_registered = n;
        subject_code = codes;
        subject_credits = credits;
        grade_obtained = grades;
        calculateSPI();
    }

    int getGradePoint(String grade) {
        grade = grade.toUpperCase();
        if (grade.equals("A")) return 10;
        else if (grade.equals("B")) return 9;
        else if (grade.equals("C")) return 8;
        else if (grade.equals("D")) return 6;
        else if (grade.equals("E")) return 5;
        else if (grade.equals("F")) return 0;
        else return 0;
    }

    void calculateSPI() {
        double totalPoints = 0;
        int totalCredits = 0;

        for (int i = 0; i < no_of_subjects_registered; i++) {
            int gradePoint = getGradePoint(grade_obtained[i]);
            totalPoints += gradePoint * subject_credits[i];
            totalCredits += subject_credits[i];
        }

        spi = totalCredits == 0 ? 0 : totalPoints / totalCredits;
    }

    void display() {
        System.out.println("Student ID: " + id_no);
        System.out.println("SPI: " + String.format("%.2f", spi));
    }
}

public class StudentSPI {
    public static void main(String[] args) {
        String[] codes = {"CS101", "MA101", "PH101"};
        int[] credits = {6,4,5};
        String[] grades = {"A", "B", "C"};

        Student s1 = new Student(101, 3, codes, credits, grades);
        s1.display();
    }
}
