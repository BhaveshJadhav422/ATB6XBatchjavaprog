package Ex_110422024;

import java.util.Scanner;

public class Lab_031 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number");
        int num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
        sc.close();
    }
}
