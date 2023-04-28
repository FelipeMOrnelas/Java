package Arrays.Desafio;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Quantos alunos tem? ");
        int quatdealunos = ler.nextInt();

        System.out.print("Quantas notas tem cada aluno? ");
        int quatdenotas = ler.nextInt();

        double turmaA[][] = new double[quatdealunos][quatdenotas];
        double total =0.0;

        for(int a = 0; a < turmaA.length; a++){
            System.out.print("\n");
            for (int n = 0; n < turmaA[a].length; n++){
                System.out.printf("Nota %d do Aluno %d: ", n+1, a+1);
                turmaA[a][n] = ler.nextDouble();
                total += turmaA[a][n];
            }
        }

        System.out.printf("\nMedia da tuma A e: %.2f", total/(quatdealunos*quatdenotas));

        ler.close();
    }
}