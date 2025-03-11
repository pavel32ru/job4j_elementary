package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        String[] names = new String[4];
        float[] prices = new float[40];
        names[0] = "Ivan Ivanovv";
        names[1] = "Petr Petrov";
        names[2] = "Pavel Pavlov";
        names[3] = "Alex Alexov";
        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива surnames равен: " + surnames.length);
        System.out.println("Размер массива prices равен: " + prices.length);
        System.out.println(names[0] + " " + names[1] + " " + names[2] + " " + names[3]);
    }
}
