package Ex_110422024;
import java.util.Scanner;
public class Lab_045 {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%3==0 && num%5==0)
        {
            System.out.println("Fizzbuzz");
        } else if (num%3==0) {
            System.out.println("Fizz");

        } else if (num%5==0) {
            System.out.println("Buzz");

        }
    }
}
