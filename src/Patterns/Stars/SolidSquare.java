package Patterns.Stars;

public class SolidSquare {

    static void main() {

        int n = 4;

        for (int row = 1; row <= n; row++) {
//            for each row -> n cols
            for (int col = 1; col <= n; col++) {
//                print star
                System.out.print("* ");
            }
//            move to next row
            System.out.println();
        }

    }

}
