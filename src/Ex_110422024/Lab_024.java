package Ex_110422024;

public class Lab_024 {
    public static void main(String[] args) {
        String name = "The Testing Academy";
        String name1= "The Testing AcademY";
        System.out.println(name == name1);
        String name2= new String("The Testing Academy");
        System.out.println(name == name2);
        System.out.println(name.equals(name2));
    }
}
