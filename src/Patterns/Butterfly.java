package Patterns;

public class Butterfly {

    static void main() {

        int n = 4;

//        Part 1
//        phase 1
//        stars
        for (int row  =  1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

//            phase 2
//            spaces
            for(int col = 1; col <= 2*(n-row); col++) {
                System.out.print("  ");
            }
//            phase 3
//            stars
            for (int col = 1; col <= row; col++) {
                System.out.print(" *");
            }

            System.out.println();
        }


//        Part 2
//        phase 1
//        stars
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }

//            phase 2
//            spaces (n+2*row-6)/(2*((row-1))
            for(int col = 1; col <= n+2*row-6; col++) {
                System.out.print("  ");
            }

//            phase 3
//            stars
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print(" *");
            }

            System.out.println();
        }

    }

}
