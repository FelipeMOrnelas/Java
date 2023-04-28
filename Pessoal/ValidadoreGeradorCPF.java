package ProjetoPessoal;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ValidadoreGeradorCPF {
    public static void main(String[] args) {

        int quantidade;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite quantos CPF: ");
        quantidade = ler.nextInt();
        ler.close();

        for (int j = 0; j < quantidade; j++) {

            Integer resposta = 0;
            while (resposta == 0) {
                String n1, cpf_gerado = "";
                Integer numero_positivo = 0;
                numero_positivo = 0;
                ArrayList<Integer> numeroGerado = new ArrayList();

                while (numero_positivo < 11) {
                    Random gerador = new Random();
                    numeroGerado.add(gerador.nextInt(10));
                    n1 = "" + numeroGerado.get(numero_positivo);
                    cpf_gerado += n1;
                    numero_positivo += 1;
                }

                Integer soma = 0, respostas = 0;
                Integer calculo, primeira_validacao, segunda_validacao;
                String n = cpf_gerado;
                ArrayList<String> cpf = new ArrayList();
                ArrayList<Integer> numero = new ArrayList();

//Transformando String em Integer
                for (int i = 0; i <= 10; i++) {
                    cpf.add(String.valueOf(n.charAt(i)));
                    numero.add(Integer.parseInt(String.valueOf(cpf.get(i))));
                }

//1º Validação
                for (int i = 0; i <= 8; i++) {
                    calculo = (numero.get(i) * (10 - i));
                    soma += calculo;
                }
                primeira_validacao = (11 - (soma % 11));

                if (primeira_validacao >= 10) {
                    primeira_validacao = 0;
                }

                if (primeira_validacao != numero.get(9)) {
//CPF Inválido
                    respostas = 1;
                }

//2º Validação
                soma = 0;
                for (int i = 0; i <= 9; i++) {
                    calculo = (numero.get(i) * (11 - i));
                    soma += calculo;
                }
                segunda_validacao = (11 - (soma % 11));

                if (segunda_validacao >= 10) {
                    segunda_validacao = 0;
                }
                if (segunda_validacao != numero.get(10)) {
//CPF Inválido
                } else {
                    if (respostas == 0) {
//CPF Válido
                        System.out.printf("%s - CPF: %s\n", j+1,cpf_gerado);
                        break;
                    } else {
//CPF Inválido
                    }
                }

            }

        }
    }
}