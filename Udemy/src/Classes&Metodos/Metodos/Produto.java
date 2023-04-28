package Metodos;

public class Produto {

    String nome;
    double preco;
    static double desconto = 0.25;

    Produto(){

    }

    Produto(String nomeInicial, Double precoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
    }

    double precoComDesconto() {
        return preco * (1 - desconto);
    }

}