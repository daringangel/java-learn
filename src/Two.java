import java.util.Scanner;
public class Two {
    public static class Student{
        void calculateGrade(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the total marks");
            double mark = sc.nextDouble();
            System.out.println("Enter the marks obtained by the student");
            double marks = sc.nextDouble();
            double percent = ((mark/marks)*100.0);
            System.out.println("The percentage of student is " +percent);


        }

    }
    public static void main(String[] args) {
        Student stu = new Student();
        Scanner sc = new Scanner(System.in);
        double marks = sc.nextDouble();



        if ( marks>=80 && marks <=100 ){
            stu.calculateGrade();
            System.out.println("He has got A grade ");



        }else if(marks >=60  ){
            stu.calculateGrade();
            System.out.println("He has got B grade");


        }else{
            stu.calculateGrade();
            System.out.println("He has failed");

        }


    }

}
