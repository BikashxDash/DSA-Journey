package Patterns.Numbers;

public class ReverseAlphabetTriangle {

    static void main() {

        int  n =  5;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                int a = n-col;
                int b = 'A';
                int ans = a+b;
                char finalans = (char)ans;
                System.out.print(finalans + " ");
            }
            System.out.println();
        }
    }

}
