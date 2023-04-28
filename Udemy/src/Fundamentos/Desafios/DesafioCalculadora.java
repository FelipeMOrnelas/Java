package Fundamentos.Desafios;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double n1, n2, calculo;
        String simbolo;

        System.out.print("Digite o primeiro numero: ");
        n1 = Double.parseDouble(ler.next());
        System.out.print("Digite o segundo numero: ");
        n2 = Double.parseDouble(ler.next());
        System.out.print("Digite o Simbulo da Operacao: ");
        simbolo = ler.next();

        calculo = "+".equals(simbolo)  ? n1+n2 : 01000000;
        calculo = "-".equals(simbolo) ? n1-n2 : calculo;
        calculo = "/".equals(simbolo)  ? n1/n2 : calculo;
        calculo = "*".equals(simbolo)  ? n1*n2 : calculo;
        calculo = "%".equals(simbolo)  ? n1%n2 : calculo;

        System.out.printf("\nCalculo %.2f %s %.2f = %s",n1,simbolo,n2,
                calculo == 01000000 ? "Não foi possivel fazer o calculo, por causa que o simbolo \""+simbolo+"\" não existe!" : calculo);

        ler.close();
    }
}
