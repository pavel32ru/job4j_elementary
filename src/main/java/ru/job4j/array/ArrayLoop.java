package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = i * 2 + 3;
        }
        for (int number : a) {
            System.out.println(number);
        }
    }
}