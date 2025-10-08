import java.util.Scanner;
public class Loop7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Enter a number (0 to stop): ");

            num = sc.nextInt();
        } while (num != 0);
        System.out.println("You entered 0. Program stopped.");
    }
}

