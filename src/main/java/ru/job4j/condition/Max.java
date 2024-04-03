package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int fragment =  left > right ? left : right;
        return fragment;
    }

    public static void main(String[] args) {
        int msg = Max.max(300, 50);
        System.out.println(msg);
    }
}