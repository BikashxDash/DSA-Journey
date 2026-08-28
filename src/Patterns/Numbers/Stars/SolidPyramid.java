package Patterns.Numbers.Stars;

public class SolidPyramid {

    static void main() {

        int n = 5;

        for (int row = 1; row <= n; row++) {
//            for each row -> spaces, stars

//            spaces
//            formula -> n-row
            for (int col = 1; col <= n-row; col++) {
//                print spaces (double)
                System.out.print("  ");
            }

//            stars
//            formula -> 1-n
            for (int col = 1; col <= 2*row-1; col++) {
                System.out.print("* ");
            }

//            move to next row
            System.out.println();
        }

    }

}
