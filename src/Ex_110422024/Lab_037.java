package Ex_110422024;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Lab_037 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number between 1-7 and i will give you the day");
        int day= sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Mon");
                break;
            case 2 :
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Only numbers between 1-7 are allowed ");
        }
    }
}
