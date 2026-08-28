package Patterns.Numbers;

public class IncreasingNumberTriangle {

    static void main() {

       int n = 5;

       for (int row = 1; row <= n; row++) {
//           for each row -> variable clos
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
           System.out.println();
       }

    }

}
