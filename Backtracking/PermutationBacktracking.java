// Question 
// Write down the code to print the all permutation of given Integer array 

import java.util.*;

public class PermutationBacktracking {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void generatePermutation(int[] arr, int idx) {
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
        int[] arr = {1, 2, 3};
        generatePermutation(arr, 0);
    }
}
