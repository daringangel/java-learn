import java.util.Scanner;
public class Action {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st integer");
        double a = sc.nextDouble();
        System.out.println("Enter 2nd integer");
        double b = sc.nextDouble();
        System.out.println("Enter your choice");
        System.out.println("Press 1: for Sum");
        System.out.println("Press 2: for Product");
        System.out.println("Press 3: for Maximum");
        System.out.println("Press 4: for Minimum");
        System.out.println("Press 5: for Random number");
        char ch = sc.next().charAt(0);
        switch(ch){
            case '1':
                System.out.println("The sum is " +(int)(a+b));
            break;
            case '2':
                System.out.println("The product is " +(int)(a*b));
            break;
            case '3':
                System.out.println("The maximum is " + (int)(Math.max(a,b)));
                break;
            case '4':
                System.out.println("The minimum is" +(int)(Math.min(a,b)));
                break;
            case '5':
                if(a<b){
                   double temp = a;
                   a=b;
                   b = temp;

                }
                double range = a-b+1;

                double ran = Math.random()*range+b;

                System.out.println("The random number between " +a+ " and "+b+ " is : "+ran);

        }



    }

}
