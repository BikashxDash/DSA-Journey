import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

//      input system
//        Scanner sc = new Scanner(System.in);
//        int age;

//        System.out.print("enter your age: ");
//        age = sc.nextInt();
//      string = sc.nextLine(); for string line
//        System.out.print("Your age is " + age);
//
//        sc.close();

        Random random = new Random();
        int number;
        number = random.nextInt(1, 6);

        System.out.println(number);

        double result;
        result = Math.pow(2, 4);
    }
}
