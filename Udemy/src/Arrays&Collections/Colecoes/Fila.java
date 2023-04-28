package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Felipe"); //se a fila tiver cheia de elemento vai retorna erro
        fila.offer("Laiane"); //se a fila tiver cheia de elemento vai retorna falso ou true

        System.out.printf(fila.peek()); //se nao tiver nenhuma elemento na fila vai retorna null
        System.out.printf(fila.element()); //se nao tiver nenhuma elemento na fila vai retorna erro

        System.out.printf(fila.remove()); // vai remover e se tiver vazia o elemento retorna erro
        System.out.printf(fila.poll()); // vai remover e se tiver vazia o elemento retorna null
    }
}
