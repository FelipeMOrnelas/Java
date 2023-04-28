package Repeticoes;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Integer nota = 0 , soma = 0 , quant = 0;

        while (nota != -1){
            System.out.print("Digite a nota: ");
            nota = entrada.nextInt();
            if (nota > 10 || nota < 0){
            } else {
                soma += nota;
                quant += 1;
            }
        }
        System.out.println("Media das notas = "+soma/quant);
        System.out.println("Quantidade de vezes validas = "+quant);
        entrada.close();
    }
}
