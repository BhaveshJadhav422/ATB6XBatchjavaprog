package Ex_110422024;

public class Lab_058 {
    public static void main(String[] args) {
       // Difference between == & .equals between Strings & arrays
        int[] arr1={1,2,3,4,5};
        int [] arr2={1,2,3,4,5};
        System.out.println(arr1==arr2);
        System.out.println(arr1.equals(arr2));
        String s1="Bhavesh";
        String s2="Bhavesh";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

    }
}
