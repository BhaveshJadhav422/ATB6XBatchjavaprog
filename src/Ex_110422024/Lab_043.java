package Ex_110422024;
import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class Lab_043 {
    public static void main(String[] args) {
        //Largest of three number using Ternary operator
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=sc.nextInt();
        System.out.println("Enter second number");
        int num2= sc.nextInt();
        System.out.println("Enter third number");
        int num3=sc.nextInt();
        int largest= num1>num2? ((num1>num3)? num1:num3): ((num2>num3)? num2:num3);
        System.out.println("Largest number is"+largest);
    }
}
