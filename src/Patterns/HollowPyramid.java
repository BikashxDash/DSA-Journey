package Patterns;

public class HollowPyramid {

    static void main() {

        int n = 5;

        for (int row = 1; row <= n; row ++) {
//            spaces
            for (int col = 1; col <= (n-row); col++) {
                System.out.print("  ");
            }

//            stars phase 1
            if (row == 1 || row == n) {
                for (int col = 1; col <= (2*row-1); col++) {
                    System.out.print("* ");
                }
            }
            else {
//                1*
                System.out.print("* ");

//                hollow spaces
                for (int col = 1; col <= (2*row-3); col++) {
                    System.out.print("  ");
                }

//                1*
                System.out.print("* ");
            }

//            move to next row
            System.out.println();
        }

    }

}
