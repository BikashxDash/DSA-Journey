import org.w3c.dom.ls.LSOutput;

public class DataTypes {

    public static void main(String[] args) {

        //Numeric DT - shorts,  byte,  int, long

        byte num1 = 127;
        System.out.println(num1);

        short  num2  = 32767;
        System.out.println(num2);

        int num3 = 50000;
        System.out.println(num3);

        long  num4  = 1234567891;
        System.out.println(num4);

        //floating DTs
        float num5  = 3.14f;
        System.out.println(num5);

        double  num6 = 3.144236521459856;
        System.out.println(num6);

        //Other  - Char, Boolean
        boolean gsuy = true;
        System.out.println(gsuy);

        char firstcharacter = 'a';
        System.out.println("My first character is: " + (char)(firstcharacter+2));
    }
}
