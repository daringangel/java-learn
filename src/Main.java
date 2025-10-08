import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the month in capitals");
        String uh = sc.nextLine();
        switch (uh){
            case"JANUARY":
            case"MARCH":
            case "May":
            case"JULY":
            case "AUGUST":
            case "OCTOBER":
            case "DECEMBER":
                System.out.println(uh + " have 31 days");
                break;

            case"APRIL":
            case "JUNE":
            case "SEPTEMBER":
            case "NOVEMBER":
                System.out.println(uh +" have 30 days");
                break;

            case "FEBRUARY":
                System.out.println(uh +" has 28 days");
                break;

            default:
                System.out.println("Invalid Input");

        }

//        switch(uh){
//            case "JANUARY":
//                System.out.println("January has 31 days");
//                break;
//            case "FEBRUARY":
//                System.out.println("February has 28 days");
//                break;
//            case "MARCH":
//                System.out.println("March has 31 days");
//                break;
//            case "APRIL":
//                System.out.println("April has 31 days");
//                break;
//            case "MAY":
//                System.out.println("May has 30 days");
//                break;
//            case "JUNE":
//                System.out.println("June has 30 days");
//                break;
//            case "JULY":
//                System.out.println("July has 31 days");
//                break;
//            case "AUGUST":
//                System.out.println("August has 30 days");
//                break;
//            case "SEPTEMBER":
//                System.out.println("September has 30 days");
//                break;
//            case "OCTOBER":
//                System.out.println("October has 31 days");
//                break;
//            case "NOVEMBER":
//                System.out.println("November has 30 days");
//                break;
//            case "DECEMBER":
//                System.out.println("December has 31 days");
//                break;
//            default:
//                System.out.println("");

        }
    }

