package students.jana_sergejenko.lesson_4.level_3.task_8;

import java.util.Scanner;

public class Program8{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num = scan.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = scan.nextInt();
        System.out.print("Enter 3rd number: ");
        int num3 = scan.nextInt();
        scan.close();

        if (num==num2&num2==num3) {
            System.out.println("All numbers are equal");
        } else if(num!=num2&num2!=num3&num!=num3){
            System.out.println("All numbers are different");
        }
        else{
            System.out.println("Neither all are equal or different");
        }
    }
}