import java.util.Scanner;

class Bank_Account {
    String accountNo, userName, email, accountType;
    double accountBalance;

    void getAccountDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account No: ");
        accountNo = sc.nextLine();
        System.out.print("Enter User Name: ");
        userName = sc.nextLine();
        System.out.print("Enter Email: ");
        email = sc.nextLine();
        System.out.print("Enter Account Type: ");
        accountType = sc.nextLine();
        System.out.print("Enter Account Balance: ");
        accountBalance = sc.nextDouble();
    }

    void displayAccountDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account No: " + accountNo);
        System.out.println("User Name: " + userName);
        System.out.println("Email: " + email);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: ₹" + accountBalance);
    }
}

public class BankTest {
    public static void main(String[] args) {
        Bank_Account acc = new Bank_Account();
        acc.getAccountDetails();
        acc.displayAccountDetails();
    }
}
