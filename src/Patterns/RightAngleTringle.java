package Patterns;

public class RightAngleTringle {

    static void main() {

        int n = 5;

        for (int row = 1; row <= n; row++) {
//            for each row -> variable clos
//            formula -> col -> 1 - value of row
            for (int col = 1; col <= row; col++) {
//                print star
                System.out.print("* ");
            }
//            move to next row
            System.out.println();
        }

    }

}
