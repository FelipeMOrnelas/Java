package Repeticoes;

import java.util.Scanner;
//
public class DesafioDiaSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome da semana: ");
        String semana = entrada.next();

        if (semana.equalsIgnoreCase("Domingo")){
            System.out.println("Domingo e igual a: 1");
        } else if (semana.equalsIgnoreCase("Segunda")){
            System.out.println("Segunda e igual a: 2");
        } else if (semana.equalsIgnoreCase("Terça") ||
                semana.equalsIgnoreCase("Terca")){
            System.out.println("Terca e igual a: 3");
        } else if (semana.equalsIgnoreCase("Quarta")){
            System.out.println("Quarta e igual a: 4");
        } else if (semana.equalsIgnoreCase("Quinta")){
            System.out.println("Quinta e igual a: 5");
        } else if (semana.equalsIgnoreCase("Sexta")){
            System.out.println("Sexta e igual a: 6");
        } else if (semana.equalsIgnoreCase("Sábado") ||
                semana.equalsIgnoreCase("Sabado")){
            System.out.println("Sabado e igual a: 7");
        } else {
            System.out.println("Voce escreveu errado ou nao existe essa semana!");
        }

        entrada.close();
    }
}
