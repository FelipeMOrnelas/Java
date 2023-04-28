package Metodos;

import java.util.Scanner;

public class DesafioMetodosTeste {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String senhaDigitada;
        DesafioMetodos pessoa = new DesafioMetodos();
        String senha = pessoa.passow;
        String usuario = pessoa.login;

        while (true) {
            System.out.print("Digite o usuario: ");
            String usuarioDigitado = entrada.next();

            System.out.print("Digite a senha: ");
            senhaDigitada = entrada.next();


            if (usuario.equalsIgnoreCase(usuarioDigitado) && senha.equalsIgnoreCase(senhaDigitada)) {
                System.out.println("Bem Vindo!");
                System.out.print("Alterar Senha: ");
                senhaDigitada = entrada.next();
                senha = senhaDigitada;
            } else {
                System.out.println("Usuario ou Senha esta errada!!");
            }
        }
    }
}