package Fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        double fahrenheit = 10;
        double celsius;
        final double ajuste = 32;
        final double fator = 5.0/9.0;

        celsius = (fahrenheit - ajuste) * fator;

        System.out.println(celsius + "°C");

    }
}
