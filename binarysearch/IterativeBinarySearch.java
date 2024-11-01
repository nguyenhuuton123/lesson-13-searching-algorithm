package com.codegym.binarysearch;

// Java implementation of iterative Binary Search
class IterativeBinarySearch {
    // Returns index of x if it is present in arr[],
    // else return -1
    int binarySearch(int arr[], int x) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;

            // Check if x is present at mid
            if (arr[middle] == x)
                return middle;

            // If x greater, ignore left half
            if (arr[middle] < x)
                left = middle + 1;

                // If x is smaller, ignore right half
            else
                right = middle - 1;
        }

        // if we reach here, then element was
        // not present
        return -1;
    }

    // O(n/2)

    // Driver method to test above
    public static void main(String args[]) {
        IterativeBinarySearch ob = new IterativeBinarySearch();
        int arr[] = { 6, 13, 14, 25, 33, 43, 51, 53, 64, 72, 84, 93, 95, 96, 97 };
        int x = 33;
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at " + "index " + result);
    }
}
