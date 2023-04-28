package Fundamentos;

public class MinhasAnotacoes {
    public static void main(String[] args) {
        //Verificação de Senha
        String senha = "Senha123";
        String senhaDigitada = "Senha123";
        var acesso = senha.equals(senhaDigitada);
        var valor = senha.length(); //quantidades de caracteres

        System.out.println(valor); //quantidades de caracteres

        if (acesso == true){
            System.out.println("Bem Vindo!!!");
        } else {
            System.out.println("Acesso Negado!!");
        }

    }
}
