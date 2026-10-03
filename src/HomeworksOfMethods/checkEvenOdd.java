package HomeworksOfMethods;

public class checkEvenOdd {

    static boolean isEven(int number) {

        return number  % 2 == 0;
    }

    static void main() {

        int num = 13;
        System.out.println(isEven(num));
    }

}
