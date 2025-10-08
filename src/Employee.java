import java.util.Scanner;
public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the employee");
        String name = sc.nextLine();
        System.out.println("Enter the basic salary of the employee");
        double bas = sc.nextDouble();
        double DA = (30.0/100.0)*bas;
        double HRA = (12.5/100.0)*bas;
        double PF = (10.0/100.0)*bas;
        double gross = bas+DA+HRA;
        System.out.println("The Gross Income of the employee is " +gross);
        double net = gross-PF;
        System.out.println("The Net Pay of the employee is " +net);
        System.out.println("The name of the employee is " +name);



    }

}
