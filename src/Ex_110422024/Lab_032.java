package Ex_110422024;

import java.util.Scanner;

public class Lab_032 {
    public static void main(String[] args) {
        System.out.println("Enter first number");
        Scanner sc= new Scanner(System.in);
        int num1=sc.nextInt();
        System.out.println("ENter second number");
        int num2=sc.nextInt();
        if(num1>num2)
        {
            System.out.println("Max is"+num1);
        }
        else
        {
            System.out.println("Max is"+num2);
        }
        sc.close();
    }
}
