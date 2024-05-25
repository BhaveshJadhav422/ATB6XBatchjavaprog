package Ex_110422024;

import java.util.Scanner;

public class Lab_034 {
    public static void main(String[] args) {
        System.out.println("Enter the score");
        Scanner sc = new Scanner(System.in);
        int score= sc.nextInt();
        if(score>=90 && score<=100)
        {
            System.out.println("Grade is A");
        }
        else if(score>=80 && score<=89)
        {
            System.out.println("Grade is B");
        } else if (score>=70 && score<=79) {
            System.out.println("Grade is C");
        }
        else if(score>=60 && score<=69) {
            System.out.println("Grade is D");
        }
        else if(score>100)
        {
            System.out.println("LOL!!!");
        }
        else {
            System.out.println("grade is E");
        }
        sc.close();

        }

    }

