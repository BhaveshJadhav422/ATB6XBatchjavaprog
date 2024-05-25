package Ex_110422024;

import java.util.Scanner;

public class Lab_036 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        if(num>0)
        {
            System.out.println("Num is positive");
        }
        else if(num<0)
        {
            System.out.println("Num is negative");
        }
        else
        {
            System.out.println("Num is zero");
        }
        sc.close();
    }
}
