package HomeworksOfMethods;

public class Maximum {

    static int getMaximum(int a,int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static void main() {
        int result = getMaximum(25, 56);
        System.out.println("The larger number is: " + result);
    }

}
