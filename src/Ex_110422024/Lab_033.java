package Ex_110422024;

import java.util.Scanner;

public class Lab_033 {
    public static void main(String[] args) {
        System.out.println("Enter the num");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        if(num>20)
        {
            System.out.println("num>20");
        } else if (num>10) {
            System.out.println("num is between 10 & 20");
        }
        else
        {
            System.out.println("num <20");
        }
        sc.close();
    }
}
