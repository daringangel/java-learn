import java.util.Scanner;

class Me {
    double balance; // to store balance

    // Method to check balance
    public void checkBalance() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter balance of user");
        double balance = sc.nextDouble();
        System.out.println("The balance of the user is " + balance);
    }

    // Method to deposit
    public void deposit(Scanner sc) {
        System.out.println("Enter balance of user");
        double balance = sc.nextDouble();
        System.out.print("Enter the amount to deposit: ");
        double amount = sc.nextDouble();
        double balance1 = balance + amount; // update balance
        System.out.println("Successfully deposited ₹" + amount);
        System.out.println("The new balance is " +balance1);
        checkBalance();
    }

    // Method to withdraw
    public void withdraw(Scanner sc) {
        System.out.println("Enter balance of user");
        double balance = sc.nextDouble();
        System.out.print("Enter the amount to withdraw: ");
        double amount = sc.nextDouble();
        if (amount <= balance) {
            double balance1 =  balance - amount; // update balance3334
            System.out.println("Successfully withdrawn ₹" + amount);
            System.out.println("New balance is " +balance1);
            checkBalance();
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

public class Again {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Me m = new Me();

        // PIN verification
        System.out.print("Enter The pin saved by user: ");
        int pin = sc.nextInt();
        System.out.print("Enter The pin stored in ATM: ");

        int x = sc.nextInt();

        if (pin == x) {
            System.out.println("The user is authentic");

            // Menu
            System.out.println("Enter user's choice:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    m.checkBalance();
                    break;
                case 2:
                    m.deposit(sc);
                    break;
                case 3:
                    m.withdraw(sc);
                    break;
                default:
                    System.out.println("Improper input");
            }
        } else {
            System.out.println("The user is not authentic");
        }

        sc.close();
    }
}

