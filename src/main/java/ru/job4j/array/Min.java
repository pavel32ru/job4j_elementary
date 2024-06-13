package ru.job4j.array;

public class Min {
    public static int findMin(int[] a) {
        int min = a[0];
        for (int index = 1; index < a.length; index++) {
            if (a[index] < min) {
                min = a[index];
            }
        }
        return min;
    }
}
