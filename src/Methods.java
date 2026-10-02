public class Methods {

//    syntax to write a method
//    returnType methodName(parameters) {
//      method body

//    global variable
//    static int value = 20;

//   declaration
    static void print2KaTable() {
        for (int i=1;i<=10;i++) {
            int ans = 2*i;
            System.out.println("-> " + ans);
        }
    }

    static void printSum(int x, int y) {
        System.out.println("Sum: " + (x+y));
    }

//    static void printSum() {
//      int x = 10, y = 11;
//      System.out.println("Sum: " + (x+y));
//    }

    static int add(int p, int q) {
        int sum = p+q;
        return sum;
    }

    static int add(int p, int q, int r) {
        int ans = p+q+r;
        return ans;
    }

    static void solve(int num) {
        System.out.println("inside solve: " + num);
        num = num * 10;
        System.out.println("inside solve: " + num);
    }

    static void printMultiple() {
        int value = 20;
        for (int i=1; i<=10; i++) {
            System.out.println(20*i);
        }
        System.out.println(value);
    }

    static void main() {

//        System.out.println("Hii");
//        print2KaTable();
//        System.out.println("Bye");

//        printSum(2,3);
//        int result = add(10, 11);
//        System.out.println("Result: " + result);

//        int ans1  = add(1,2);
//        int ans2 = add(1,2,3);
//        System.out.println("Ans1: " + ans1);
//        System.out.println("Ans2: " + ans2);

//        Call By Value(copy pass kare ho)
//        int num = 5;
//        System.out.println("inside main: " + num);
//        solve(num);
//        System.out.println("inside main: " + num);

        printMultiple();

    }
}

//Method Signeture -> (returnType, Name, Parameter)
