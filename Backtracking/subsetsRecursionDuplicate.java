
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetsRecursionDuplicate {

    static List<List<Integer>> allSubsets = new ArrayList<>();

    static void subSetsaver(int[] arr, int index, List<Integer> current) {

        if (arr.length == index) {
            allSubsets.add(new ArrayList<>(current));
            return;
        }
        current.add(arr[index]);
        subSetsaver(arr, index + 1, current);
        current.remove(current.size() - 1);

        int idx = index + 1;
        while (idx < arr.length && arr[idx] == arr[idx - 1]) {
            idx++;
        }
        subSetsaver(arr, idx, current);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2};

        Arrays.sort(arr);

        subSetsaver(arr, 0, new ArrayList<>());

        System.out.println(allSubsets);
    }

}

/*
====================== NOTES FOR REVISION ======================

Problem:
Generate all UNIQUE subsets from an array that may contain duplicates.

Example:
Input  : [1,2,2]
Output : [[],[1],[2],[1,2],[2,2],[1,2,2]]

---------------------------------------------------------------

1. WHY SORTING IS REQUIRED
Arrays.sort(arr);

Sorting groups duplicate numbers together.
Example:
[2,1,2] -> [1,2,2]

This makes it possible to skip duplicates easily.

---------------------------------------------------------------

2. RECURSION CHOICES

For every element we have two choices:

1) Include the element
2) Exclude the element

current.add(arr[index])  -> include
skip to next recursion   -> exclude

---------------------------------------------------------------

3. BACKTRACKING STEP

current.remove(current.size() - 1);

After exploring the "include" branch, we undo the choice
so that recursion can explore the "exclude" branch.

---------------------------------------------------------------

4. MOST IMPORTANT LOGIC (SKIPPING DUPLICATES)

int idx = index + 1;

while(idx < arr.length && arr[idx] == arr[idx - 1])
{
    idx++;
}

This skips all duplicate values when we choose to exclude
an element.

Example:
[1,2,2]

If we exclude the first 2, we should jump directly after
all 2's, otherwise duplicate subsets will be generated.

---------------------------------------------------------------

5. WHY NEW ARRAYLIST IS CREATED

allSubsets.add(new ArrayList<>(current));

Because "current" keeps changing during recursion.
If we store the same reference, all subsets will end up identical.

---------------------------------------------------------------

6. TIME COMPLEXITY

O(2^n)

Because every element still has two choices:
include or exclude.

---------------------------------------------------------------

7. SPACE COMPLEXITY

Recursion stack : O(n)
Result storage  : O(2^n * n)

---------------------------------------------------------------

CORE IDEA TO REMEMBER

1. Sort the array
2. Include element
3. Backtrack
4. Skip duplicates when excluding

===============================================================
 */
