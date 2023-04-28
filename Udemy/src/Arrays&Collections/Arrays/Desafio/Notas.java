package Arrays.Desafio;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Double media = 0.0;

        System.out.print("Quantas notas voce vai informar? ");
        int quatnotas = ler.nextInt();


        double notas[] = new double[quatnotas];

        for (int i = 0; i < quatnotas; i++){
            System.out.printf("Digite a %dº nota: ", i+1);
            notas[i] = ler.nextDouble();
        }


        for (double nota : notas){
            media += nota;
        }

        System.out.println("Media e: "+media/notas.length);
        ler.close();
    }
}