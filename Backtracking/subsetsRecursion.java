// Basic Recursion 
// Question - 1) Find the all possible subset of given array using recursion.

import java.util.ArrayList;
import java.util.List;

public class subsetsRecursion {

    static void printSubsets(int[] arr, int index, List<Integer> current) {

        if (index == arr.length) {
            System.out.print(current + " ");
            return;
        }
        current.add(arr[index]);
        printSubsets(arr, index + 1, current);
        current.remove(current.size() - 1);
        printSubsets(arr, index + 1, current);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        printSubsets(arr, 0, new ArrayList<>());
    }
}

/* 
Tree structure for arr = {1,2,3}

Each level represents a decision for one element:
LEFT  -> include element
RIGHT -> exclude element

                          []
                   /---------------\
                [1]                 []
             /--------\         /--------\
          [1,2]       [1]      [2]       []
         /-----\     /----\   /----\   /----\
    [1,2,3] [1,2] [1,3] [1] [2,3] [2] [3]   []

Important Notes:

1. current.add(arr[index])
   -> choose the element (include in subset)

2. current.remove(current.size()-1)
   -> backtracking step
      removes the element so we can explore the "exclude" branch

3. printSubsets(arr, index + 1, current)
   -> move to next element

4. Base condition:
   when index == arr.length
   we have formed one complete subset

Total subsets = 2^n
For n = 3 → 8 subsets

Time Complexity : O(2^n)
Space Complexity: O(n) recursion stack

Key Idea:
Each element has two choices:
include it OR skip it.
This forms a binary recursion tree.
 */
