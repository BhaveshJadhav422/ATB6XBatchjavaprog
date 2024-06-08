package Ex_110422024;

import java.util.Scanner;

public class Lab_062 {
    public static void main(String[] args) {
        //enter marks of 5 subject and print it using array
        float marks[]=new float[5];
        Scanner sc =new Scanner(System.in);
        System.out.println("ENter your 1st subject marks");
        marks[0]= sc.nextFloat();
        System.out.println("ENter your 2nd subject marks");
         marks[1]= sc.nextFloat();
        System.out.println("ENter your 3rd subject marks");
        marks[2]= sc.nextFloat();
        System.out.println("ENter your 4th subject marks");
        marks[3]= sc.nextFloat();
        System.out.println("ENter your 5th subject marks");
        marks[4]= sc.nextFloat();
        for (int i=0;i<marks.length;i++)
        {
            if(marks[i]<35)
            {
                System.out.println("You are failed in this sibject"+marks[i]);
            }
            else {
                System.out.println(marks[i]);
            }
        }
        sc.close();

    }
}
