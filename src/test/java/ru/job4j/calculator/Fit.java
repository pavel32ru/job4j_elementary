package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double result = 90;
        return result;
    }

    public static double womanWeight(short height) {
        double result = 63;
        return result;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Man 187 is " + man);
        height = 167;
        double woman = Fit.womanWeight(height);
        System.out.println("Man 167 is " + woman);
    }

}