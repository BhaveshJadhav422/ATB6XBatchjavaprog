package Ex_110422024;
import java.util.Scanner;
public class Lab_055 {
    public static void main(String[] args) {
        //factorial program
        System.out.println("Enter the number for factorial");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 1;
        for (int i = num; i >= 1; i--) {
            result = result*i;

        }
        System.out.println(result);
    }
}
