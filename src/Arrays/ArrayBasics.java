package Arrays;

import java.util.Scanner;

public class ArrayBasics {

    static void main() {

//        //Declaration
//        int  arr[];
//        //Allocation
//        arr = new int[5];
//        //Initialisation
//        int brr[] = {10,20,30};
//
//        int n = brr.length;
//
//        for (int val : brr) {
//            System.out.println(val);
//        }

//        for(int index=0; index<=n-1; index++) {
//            System.out.println(brr[index]);
//        }



//        System.out.println("Value at 0 index " + brr[0]);
//        System.out.println("Value at 1 index " + brr[1]);
//        System.out.println("Value at 2 index " + brr[2]);

//        input in array

        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;

        //input
        for(int i = 0; i<=n-1; i++) {
            System.out.println("Provide input for index: " + i);
            arr[i] = sc.nextInt();
        }

        //print
        System.out.println("Your array contains: ");
        for(int val: arr) {
            System.out.println(val);
        }

    }

}
