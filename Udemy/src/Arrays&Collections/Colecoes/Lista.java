package Colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Felipe"));
        lista.add(new Usuario("Gabriel"));
        lista.add(new Usuario("Bruna"));
        lista.add(new Usuario("Amanda"));
        lista.add(new Usuario("Laiane"));

        System.out.println(lista.get(3));

        lista.remove(1);
        lista.remove(new Usuario("Amanda"));

        for(Usuario nomes : lista){
            System.out.println(nomes);
        }

        if (lista.contains(new Usuario("Felipe"))){
            System.out.printf("Lista contem Felipe");
        }


    }
}