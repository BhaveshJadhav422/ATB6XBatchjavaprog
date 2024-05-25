package Ex_110422024;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab_035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side1,side2,side3 I will let you know the triangle");
        int side1 =sc.nextInt();
        int side2 =sc.nextInt();
        int side3 =sc.nextInt();

        if((side1==side2) && (side2==side3) && (side1==side3))
        {
            System.out.println("Triangle is equilateral");
        }
        else if((side1==side2) || (side2==side3) || (side1==side3))
        {
            System.out.println("Triangle is Isoceles");
        }
        else
        {
            System.out.println("ABC");
        }
        sc.close();
    }
}
