import java.util.Scanner;

class Member {
    String name;
    int age;
    long pnum;
    String add;
    int salary;
}

class Employee extends Member {
    String specialization;

    void printspecialization() {
        System.out.println("\n------- Detail of Employee -------");
        System.out.println("Employee Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Phone Num: " + this.pnum);
        System.out.println("Address: " + this.add);
        System.out.println("Salary: " + this.salary);
        System.out.println("Specialization: " + this.specialization);
    }
}

class Manager extends Member {
    String department;

    void printdepartment() {
        System.out.println("\n------- Detail of Manager -------");
        System.out.println("Manager Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Phone Num: " + this.pnum);
        System.out.println("Address: " + this.add);
        System.out.println("Salary: " + this.salary);
        System.out.println("Department: " + this.department);
    }
}

public class Inhair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee em = new Employee();
        System.out.println("--- Register Employee ---");
        System.out.print("Name: ");
        em.name = sc.nextLine();
        System.out.print("Age: ");
        em.age = sc.nextInt();
        System.out.print("Phone Num: ");
        em.pnum = sc.nextLong();
        sc.nextLine();
        System.out.print("Address: ");
        em.add = sc.nextLine();
        System.out.print("Salary: ");
        em.salary = sc.nextInt();
        sc.nextLine();
        System.out.print("Specialization: ");
        em.specialization = sc.nextLine();

        Manager mg = new Manager();
        System.out.println("\n--- Register Manager ---");
        System.out.print("Name: ");
        mg.name = sc.nextLine();
        System.out.print("Age: ");
        mg.age = sc.nextInt();
        System.out.print("Phone Num: ");
        mg.pnum = sc.nextLong();
        sc.nextLine();
        System.out.print("Address: ");
        mg.add = sc.nextLine();
        System.out.print("Salary: ");
        mg.salary = sc.nextInt();
        sc.nextLine();
        System.out.print("Department: ");
        mg.department = sc.nextLine();

        em.printspecialization();
        mg.printdepartment();

        sc.close();
    }
}

