package loops;

import java.util.Scanner;

public class Enine {

    public static void main(String[] args){
        int num,i,fact;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
        fact = 1;

        for (i = 1; i <=num ; i++) {
            fact = fact*i;


        }
        System.out.println(fact);

    }


}
