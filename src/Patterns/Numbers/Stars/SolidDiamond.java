package Patterns.Numbers.Stars;

public class SolidDiamond {

    static void main() {

        int n = 4;

//        solid pyramid part 1
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

//        inverted pyramid part 2
        for (int row = 1; row <= n; row++) {

//            skip row 1
            if(row == 1) {
                continue;
            }

//            spaces
            for (int col = 1; col <= row-1; col++) {
                System.out.print("  ");
            }

//            stars
            for (int col = 1; col <= (2*n-2*row+1); col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }

}
