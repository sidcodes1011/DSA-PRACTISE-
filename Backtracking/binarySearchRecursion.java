// Basic Recursion 
// Question - 5) Given array find given element index using binary search through recursion

public class binarySearchRecursion {

    static int binarySearchHelper(int[] arr, int target, int start, int end) {

        if (start <= end) {
            int mid = (start + end) / 2;
            // Case 1 : If mid == our target we return index

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] <= target) {            // Case 2 : If target is greater than arr[mid]
                return binarySearchHelper(arr, target, mid + 1, end);
            } else {                                      // Case 3 : If target is smaller than arr[mid]
                return binarySearchHelper(arr, target, start, mid - 1);
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        return binarySearchHelper(arr, target, start, end);
    }

    public static void main(String[] args) {

        int[] arr = {-1, 0, 3, 5, 9, 12};

        int target = 5;
        int index = binarySearch(arr, target);

        if (index == -1) {
            System.out.println("Invalid target !!!");
        } else {
            System.out.println("The target is at index :::: " + (index + 1));
        }
    }
}
