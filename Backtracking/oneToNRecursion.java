// Basic Recursion 
// Question - 1) Print no from n to 1 using recursion 

public class oneToNRecursion {

    static void printer(int n) {
        if (n < 1) {
            return;
        }
        System.out.print(n + " ");
        printer(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        printer(n);
    }
}
