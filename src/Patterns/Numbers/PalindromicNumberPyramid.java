package Patterns.Numbers;

public class PalindromicNumberPyramid {

    static void main() {

        int n = 4;

        for (int row = 1; row <= n; row++) {

//            spaces
            for (int col = 1; col <=  n-row; col++) {
                System.out.print("  ");
            }

//            numbers
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }

//            part 2 numbers
            int decRowValue = row-1;
            for (int col = 1; col <= row-1; col++) {
                System.out.print(decRowValue + " ");
                decRowValue--;
            }

            System.out.println();
        }
    }
}
