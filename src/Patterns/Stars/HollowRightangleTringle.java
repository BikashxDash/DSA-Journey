package Patterns.Stars;

public class HollowRightangleTringle {

    static void main() {

        int n = 5;

        for (int row = 1; row <= n; row ++) {
//            for each row -> variable cols
            if(row == 1  || row == 2  || row == n) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }
            }
            else {
//                middle rows
//                1*
                System.out.print("* ");

//                (row-2) spaces
                for (int col = 1; col <= (row-2); col++) {
                    System.out.print("  ");
                }
//               1*
                System.out.print("* ");
            }
//            move to next row
            System.out.println();
        }

    }

}
