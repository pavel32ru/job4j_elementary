package ru.job4j;

public class ArgumentsMethod {
    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }
    public static void main(String[] args) {
        String name = "Pavel Tichkovskii";
        ArgumentsMethod.hello(name);
    }
}
