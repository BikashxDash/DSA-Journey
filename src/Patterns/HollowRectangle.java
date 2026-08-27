package Patterns;

public class HollowRectangle {

    static void main() {

        int n = 4;

        for(int row = 1; row <= n; row++) {
//            for each row -> 6 cols
            for (int col = 1; col <= 6; col++) {
                if(row == 1 || row == n) {
                    System.out.print("* ");
                }
                else {
//                    middle
                    if(col == 1){
                        System.out.print("* ");
                    }
                    else if(col == 6) {
                        System.out.print("* ");
                    }
                    else {
//                        middle cols
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }

    }

}
