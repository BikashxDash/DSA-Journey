package Patterns.Numbers;

public class IncreasingAlphabetTriangle {

    static void main() {

        int n = 5;


        for (int row = 1; row <= n; row++) {
//            for each row -> variable cols
            for (int col = 1;  col <= row; col++) {
                int a = col;
                int b = ('A' -  1);
                int  ans = a+b;
                char finalAns = (char)ans;

                System.out.print(finalAns + " ");
            }
            System.out.println();
        }

    }

}
