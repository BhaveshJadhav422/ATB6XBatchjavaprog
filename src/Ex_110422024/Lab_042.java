package Ex_110422024;
import java.util.Scanner;
public class Lab_042 {
    public static void main(String[] args) {
        System.out.println("web will be doing arthematic operations");
        System.out.println("Enter first number");
        Scanner sc=new Scanner(System.in);
        int num1= sc.nextInt();
        System.out.println("ENter second number");
        int num2= sc.nextInt();
        System.out.println("Now enter which arthematic opersation u want to perform");
        char symbol = sc.next().charAt(0);

         switch (symbol) {
            case '+':
                 int result=num1 + num2;
                System.out.println("addition is"+result);
                break;
            case '-':
                int result1= num1 - num2;
                System.out.println("subtraction is"+result1);
                break;
            case '/':
                int result2= num1 / num2;
                System.out.println("Division is "+result2);
                break;
            case '*':
                int result3= num1 * num2;
                System.out.println("Multiplication is"+result3);
                break;
            default:
                System.out.println("No result found");;
        }
    }
}
