package Ex_110422024;

import java.util.Scanner;

public class Lab_039 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter itemcode");
        int itemcode =sc.nextInt();
        switch (itemcode){
            case 001,002,003:
                System.out.println("It's an electronic device");
                break;
            case 004,005,006:
                System.out.println("It's a Mechanical device");
                break;
            default:
                System.out.println("None");
        }
    }
}
