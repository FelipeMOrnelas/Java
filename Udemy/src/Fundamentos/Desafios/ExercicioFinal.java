package Fundamentos.Desafios;

import java.util.Scanner;

public class ExercicioFinal {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//1 - Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
        System.out.print("Digite a tempeperatura em Fahrenheit: ");
        double fahrenheit = ler.nextDouble();
        double formula = (fahrenheit - 32) / 1.8;

        System.out.printf("Valor em Celsius: %.2fºC\n", formula);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//2 - Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
        System.out.print("\nDigite a tempeperatura em Celsius: ");
        double celsius = ler.nextDouble();
        double conversao = celsius * 1.8 + 32;

        System.out.printf("Valor em Fahrenheit: %.2fºF\n", conversao);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//3 - Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
        System.out.print("\nDigite a sua altura: ");
        double altura = ler.nextDouble();
        System.out.print("Digite seu peso: ");
        double peso = ler.nextDouble();

        double imc = peso / (Math.pow(altura, 2));

        System.out.printf("Seu IMC e: %.2f\n", imc);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//4 - Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
        System.out.print("\nDigite um numero: ");
        double numero = ler.nextDouble();

        System.out.println("Valor ao quadrado: "+ Math.pow(numero, 2));
        System.out.println("Valor ao cubo: "+ Math.pow(numero, 3));

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//5 - Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
        System.out.print("\nDigite o valor da base do triangulo: ");
        double base = ler.nextDouble();
        System.out.print("Digite o valor da altura do triangulo: ");
        double alturaT = ler.nextDouble();

        double areadotriangulo = (alturaT*base)/2;

        System.out.println("Valor da Base do Triangulo e: "+areadotriangulo);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//6 - Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta
        System.out.println("\nEquação: ax² + bx + c = 0");

        System.out.print("Digite o valor de A: ");
        int a = ler.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = ler.nextInt();

        System.out.print("Digite o valor de C: ");
        int c = ler.nextInt();

        int delta = (b * b) - (4 * a * c);

        System.out.printf("Sua equação é: %dx² + %dx + %d = 0", a, b, c);

        System.out.println("O delta é: " + delta);

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);

        System.out.printf("O x1 da equação é: %.2f", x1);

        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.printf("O x2 da equação é: %.2f" ,x2);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ler.close();
    }
}
