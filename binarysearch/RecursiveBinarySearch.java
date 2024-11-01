package com.codegym.binarysearch;

// Java implementation of recursive Binary Search
public class RecursiveBinarySearch {
    // Returns index of x if it is present in arr[left..right], else return -1
    int binarySearch(int arr[], int left, int right, int x) {
        if (right >= left) {
            int middle = (left + right) / 2;

            // If the element is present at the
            // middle itself
            if (arr[middle] == x)
                return middle;

            // If element is smaller than middle, then
            // it can only be present in left subarray
            if (arr[middle] > x)
                return binarySearch(arr, left, middle - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, middle + 1, right, x);
        }

        // We reach here when element is not present in array
        return -1;
    }

    // Driver method to test above
    public static void main(String args[]) {
        RecursiveBinarySearch ob = new RecursiveBinarySearch();
        int arr[] = { 6, 13, 14, 25, 33, 43, 51, 53, 64, 72, 84, 93, 95, 96, 97 };
        int n = arr.length;
        int x = 33;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}
