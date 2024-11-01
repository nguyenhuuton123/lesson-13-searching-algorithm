package com.codegym.linearsearch;

public class LinearSearchExample01 {

    public static void main(String args[]) {
        int arr[] = { 2, 10, 3, 4, 10, 40 }; // O(1)
        int x = 10; // O(1)

        int result = linearSearch(arr, x);//O(13)
        if (result == -1)//O(1)
            System.out.print("Element is not present in array");//O(1)
        else
            System.out.print("Element is present at index "
                    + result + " and has value " + x);
    }

    //O(n) + 5 ~ O(n)

    public static int linearSearch(int arr[], int value) {
        for (int i = 0; i < arr.length; i++) { // O(6)
            if (arr[i] == value) return i; // O(6)
        }
        //O(6) + O(6) = O(12)
        return -1; //O(1)
    }
}
