package Patterns.Numbers;

public class AlphabetPalindromePyramid {

    static void main() {

        int n = 4;

        for (int row = 1; row <= n; row++) {

//            spaces
            for (int col = 1; col <= n-row; col++) {
                System.out.print("  ");
            }

//            part 1 1st triangle
            for (int col = 1; col <= row; col++) {
                int a = col;
                int b = 'A'-1;
                int ans = a+b;
                char finalAns = (char)ans;
                System.out.print(finalAns + " ");
            }

//            part3 2nd triangle
            char toPrint = (char)(row + 'A' - 2);
            for (int col = 1; col <= row-1; col++) {
                System.out.print(toPrint + " ");
                toPrint--;
            }

            System.out.println();

        }

    }

}
