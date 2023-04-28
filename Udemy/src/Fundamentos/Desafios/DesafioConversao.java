package Fundamentos.Desafios;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {

        String valor1, valor2, valor3;
        Scanner ler = new Scanner(System.in);

        System.out.print("Primeiro salario: ");
        valor1 = ler.nextLine().replace(",",".");
        System.out.print("Segundo salario: ");
        valor2 = ler.next().replace(",",".");
        System.out.print("Terceiro salario: ");
        valor3 = ler.next().replace(",",".");

        Double salario1 = Double.parseDouble(valor1);
        Double salario2 = Double.parseDouble(valor2);
        Double salario3 = Double.parseDouble(valor3);

        Double media = ((salario1 + salario2 + salario3 )/3);

        System.out.printf("Media salarial e: %s", media);

        ler.close();
    }
}
