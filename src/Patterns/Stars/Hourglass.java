package Patterns.Stars;

public class Hourglass {

    static void main() {

        int n = 4;

        for (int row = 1; row <= n; row++) {
//            spaces
            for (int col = 1; col <= row - 1; col++) {
                System.out.print("  ");
            }

//            stars
            for (int col = 1; col <= 2 * (n - row) + 1; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

            for (int row = n-1; row >= 1; row--) {

                //            spaces
                for (int col = 1; col <= row-1; col++) {
                    System.out.print("  ");
                }

                //            stars
                for (int col = 1; col <= 2 *(n- row) + 1; col++) {
                    System.out.print("* ");
                }

                System.out.println();
            }

    }

}
