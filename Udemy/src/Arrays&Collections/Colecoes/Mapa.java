package Colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuario = new HashMap<>();

        usuario.put(1, "Felipe");
        usuario.put(2, "Mariuba");
        usuario.put(3, "Laiane");
        usuario.put(4, "Pietra");

        System.out.println(usuario.size());
        System.out.println(usuario.isEmpty());

        System.out.println(usuario.keySet());
        System.out.println(usuario.values());
        System.out.println(usuario.entrySet());
        System.out.println(usuario.get(2));

        for(int chave: usuario.keySet()){
            System.out.println(chave);
        }

        for(String valor: usuario.values()){
            System.out.println(valor);
        }

        for(Map.Entry<Integer, String> registro: usuario.entrySet()){
            System.out.println(registro.getKey());
            System.out.println(registro.getValue());
        }

    }

}
