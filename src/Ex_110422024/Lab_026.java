package Ex_110422024;

public class Lab_026 {
    public static void main(String[] args) {
        //find max and min bet 2 numbers using Ternary operator
        int a= 10;
        int b=20;
        int max= a<b ? b:a;
        int min= a<b ? a:b;
        System.out.println(max);
        System.out.println(min);
    }
}
