package Ex_110422024;

public class Lab_053 {
    public static void main(String[] args) {
        //even and odd number program using for loop and continue keyword
        for (int i=1;i<=10;i++)
        {
            if(i%2==0)
            {
                System.out.println("even number ->"+i);
                continue;
            }
            System.out.println("odd number ->"+i);
        }
    }
}
