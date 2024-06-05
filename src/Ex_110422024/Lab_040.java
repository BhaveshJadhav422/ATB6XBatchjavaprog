package Ex_110422024;

public class Lab_040 {
    public static void main(String[] args) {
        //yeild function to return a value from switch
        char code='B';
        int value= switch (code){
            case 'A':
                yield 65;
            case 'B':
                yield 66;
            default:
                yield 100;
        };
        System.out.println(value);
    }
}
