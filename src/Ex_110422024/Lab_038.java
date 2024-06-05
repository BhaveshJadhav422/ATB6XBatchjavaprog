package Ex_110422024;

import java.util.Scanner;

public class Lab_038{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a char and i will tell u it is a vowel or no");
        char user_input=sc.next().charAt(0);

        switch(user_input){
            case 'a':
                System.out.println("Is a vowel");
                break;
            case 'e' :
                System.out.println("Is a vowel");
                break;
            case 'i':
                System.out.println("Is a vowel");
                break;
            case 'o':
                System.out.println("Is a vowel");
                break;
            case 'u':
                System.out.println("Is a vowel");
                break;
            default:
                System.out.println("Not a vowel ");
        }
    }
}

