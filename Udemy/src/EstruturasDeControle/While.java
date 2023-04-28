package Repeticoes;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a palavra chave: ");
        String chave = entrada.next();

        while (!chave.equalsIgnoreCase("sair")){

            System.out.println("Errou!!");
            System.out.print("Digite a palavra chave: ");
            chave = entrada.next();
        }

        entrada.close();
    }
}



