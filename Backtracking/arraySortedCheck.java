// Basic Recursion 
// Question - 5) Identify if given array is sorted or not using recursion 

public class arraySortedCheck {

    static boolean arraySortCheck(int[] arr, int n) {

        if (n == 0 || n == 1) {
            return true;
        }

        return arr[n - 1] >= arr[n - 2] && arraySortCheck(arr, n - 1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Sorted op :: " + arraySortCheck(arr, arr.length));
    }
}
