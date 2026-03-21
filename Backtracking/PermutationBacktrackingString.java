// Question 
// Write down the code to print the all permutation of given String of unique character  

import java.util.Arrays;

public class PermutationBacktrackingString {

    static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void generatePermutation(String[] arr, int idx) {
        if (idx == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            swap(arr, idx, i);
            generatePermutation(arr, idx + 1);
            swap(arr, idx, i);
        }
    }

    public static void main(String[] args) {
        String a = "abc";

        String[] arr = a.split("");
        generatePermutation(arr, 0);
    }
}
