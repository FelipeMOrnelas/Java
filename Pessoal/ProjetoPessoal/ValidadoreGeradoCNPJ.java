package ProjetoPessoal;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
//
public class ValidadoreGeradoCNPJ {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.print("Digite quantos CNPJ: ");
        int quantidade = ler.nextInt();
        ler.close();

        for (int b = 0; b < quantidade; b++) {

            Integer resposta = 0;
            while (resposta == 0) {
                String n1, cnpj_gerado = "";
                Integer numero_positivo = 0;
                numero_positivo = 0;
                ArrayList<Integer> numeroGerado = new ArrayList();

                while (numero_positivo < 14) {
                    Random gerador = new Random();
                    numeroGerado.add(gerador.nextInt(10));
                    n1 = "" + numeroGerado.get(numero_positivo);
                    cnpj_gerado += n1;
                    numero_positivo += 1;
                }

                Integer soma = 0;
                Integer respostas = 0;
                Integer calculo, primeira_validacao, segunda_validacao;
                Integer j = 0;

                String n = cnpj_gerado;

                ArrayList<String> cnpj = new ArrayList();
                ArrayList<Integer> numero = new ArrayList();
                ArrayList<Integer> reverso_cnpj = new ArrayList();

//Transformando String em Integer
                for (int i = 0; i <= 13; i++) {
                    cnpj.add(String.valueOf(n.charAt(i)));
                    numero.add(Integer.parseInt(String.valueOf(cnpj.get(i))));
                }

//Reverso CNPJ
                for (int i = 13; i >= 0; i--) {
                    reverso_cnpj.add(numero.get(i));
                }

//1º Validação
                for (int i = 2; i <= 9; i++) {
                    calculo = (reverso_cnpj.get(i) * (2 + j));
                    soma += calculo;
                    j += 1;
                }

                j = 0;
                for (int i = 10; i <= 13; i++) {
                    calculo = (reverso_cnpj.get(i) * (2 + j));
                    soma += calculo;
                    j += 1;
                }

                primeira_validacao = (11 - (soma % 11));

                if (primeira_validacao >= 10) {
                    primeira_validacao = 0;
                }

                if (primeira_validacao != numero.get(12)) {
//CNPJ Inválido
                    respostas = 1;
                }

//2º Validação
                soma = 0;
                j = 0;
                for (int i = 1; i <= 8; i++) {
                    calculo = (reverso_cnpj.get(i) * (2 + j));
                    soma += calculo;
                    j += 1;
                }

                j = 0;
                for (int i = 9; i <= 13; i++) {
                    calculo = (reverso_cnpj.get(i) * (2 + j));
                    soma += calculo;
                    j += 1;
                }

                segunda_validacao = (11 - (soma % 11));

                if (segunda_validacao >= 10) {
                    segunda_validacao = 0;
                }

                if (segunda_validacao != numero.get(13)) {
//CNPJ Inválido
                } else {
                    if (respostas == 0) {
//CNPJ Válido
                        System.out.printf("%s - CNPJ: %s\n", b+1,cnpj_gerado);
                        break;
                    } else {
//CNPJ Inválido
                    }
                }
            }
        }
    }
}