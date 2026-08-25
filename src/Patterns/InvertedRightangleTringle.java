package Patterns;

public class InvertedRightangleTringle {

    static void main() {

        int n = 5;

        for (int row = 1; row <= n; row++) {
//            formula -> col -> n-1
            for (int col = 1; col <= n-row+1; col++) {
//                print star
                System.out.print("* ");
            }
//            move to next row
            System.out.println();
        }

    }

}
