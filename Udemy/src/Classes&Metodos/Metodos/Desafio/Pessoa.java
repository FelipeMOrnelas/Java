package Metodos.Desafio;

public class Pessoa {

    String nome;
    double peso;

    Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    void Comer(Comida comida){
        if(comida != null){
            this.peso += comida.peso;
        }
    }

    String apresentar(){
        return "Ola eu sou o " + nome + " meu peso e " + peso;
    }

}
