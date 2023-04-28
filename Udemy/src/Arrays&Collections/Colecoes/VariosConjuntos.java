package Colecoes;

import java.util.HashSet;

public class VariosConjuntos {
    public static void main(String[] args) {
//HashSet não aceita repetição de valores

        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('X');

        System.out.println("Tamanho e: "+conjunto.size());

        System.out.println("Remover: "+conjunto.remove("teste"));
        System.out.println("Remover: "+conjunto.remove("Teste"));
        System.out.println("Remover: "+conjunto.remove('X'));

        System.out.println("Tamanho e: "+conjunto.size());

        System.out.println("Contem: "+conjunto.contains(1));
        System.out.println("Contem: "+conjunto.contains("Teste"));

        HashSet num = new HashSet();

        num.add(1);
        num.add(2);
        num.add(3);

        System.out.println(num);
        System.out.println(conjunto);

        conjunto.addAll(num);
        System.out.println("Unir: "+conjunto);

        conjunto.clear();
        System.out.println("Excluir: "+conjunto);

    }
}