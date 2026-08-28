package Patterns.Numbers.Stars;

public class SolidRectangular {

    static void main() {

      int n = 3;

        for (int row = 1; row <= n; row++) {
//            for each row -> 5 col
            for (int col = 1; col <= 5; col++) {
//                print star
                System.out.print("* ");
            }
//            move to next row
            System.out.println();
        }

    }

}
