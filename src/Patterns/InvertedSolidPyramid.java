package Patterns;

public class InvertedSolidPyramid {

    static void main() {

        int n = 4;

        for (int row = 1; row <= n; row++) {

//            spaces
            for (int col = 1; col <= row-1; col++) {
                System.out.print("  ");
            }

//            stars
            for (int col = 1; col <= 2*n-2*row+1; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }

}
