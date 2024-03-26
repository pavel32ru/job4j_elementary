package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("140 rubles are 2. Test result : " + euro + passed);
        float dollar = Converter.rubleToDollar(480);
        input = 240;
        expected = 4;
        output = Converter.rubleToDollar(input);
        passed = expected == output;
        System.out.println("480 rubles are 8. Test result : " + dollar + passed);
    }
}