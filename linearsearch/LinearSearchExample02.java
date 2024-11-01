package com.codegym.linearsearch;

public class LinearSearchExample02 {

    public static void main(String args[]) {
        Student ty = new Student(1, "Tý");
        Student teo = new Student(2, "Tèo");
        Student to = new Student(3, "Tồ");

        Student[] students = new Student[3];
        students[0] = ty;
        students[1] = teo;
        students[2] = to;

        int searchingId = 2;

        int result = linearSearch(students, searchingId);
        if (result == -1)
            System.out.print("Element is not present in array");
        else
            System.out.print("Element is present at index "
                    + result + " and has value " + students[result]);
    }

    public static int linearSearch(Student[] arr, int studentId) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getId() == studentId) return i;
        }
        return -1;
    }
}
