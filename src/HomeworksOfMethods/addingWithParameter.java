package HomeworksOfMethods;

public class addingWithParameter {

    static int add(int a, int b) {
        int sum = a+b;

        return sum;
    }

    static void main() {

        int sum = add(5, 3);
        System.out.println("The sum is: " + sum);

    };
}
