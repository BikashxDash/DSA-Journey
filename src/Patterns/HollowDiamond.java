package Patterns;

public class HollowDiamond {

    static void main() {

        int n = 4;

//        part 1
        for (int row = 1; row <= n; row ++) {
//            for each row -> variable cols
//            spaces (part 1)
            for (int col = 1; col <= (n-row); col++) {
                System.out.print("  ");
            }

//            part - 2
//            stars phase 1
            if (row == 1) {
                for (int col = 1; col <= (2*row-1); col++) {
                    System.out.print("* ");
                }
            }

//            star with hollow phase 2
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

//        part 2
        for (int row = 1; row <= n; row++) {

            if(row == 1) {
                continue;
            }

//            spaces
            for (int col = 1; col <= row-1; col++) {
                System.out.print("  ");
            }

            System.out.print("* ");

//            hollow
            for (int col = 1; col <= (2*n-2*row-1); col++) {
                System.out.print("  ");
            }

            if(row == 4) {
                continue;
            }

            System.out.print("* ");

            System.out.println();
        }

    }

}
