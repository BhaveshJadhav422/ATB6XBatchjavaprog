package Ex_110422024;

public class Lab_052 {
    public static void main(String[] args) {
        //continue keyword
        for (int i=0;i<10;i++)
        {
            System.out.println(i);
            if(i==5)
            {
                continue;
            }
            System.out.println("After");
        }
    }
}
