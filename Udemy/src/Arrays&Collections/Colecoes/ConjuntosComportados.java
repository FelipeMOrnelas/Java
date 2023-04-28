package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntosComportados {
    public static void main(String[] args) {

        Set<String> listaAprovados = new HashSet<String>();
        listaAprovados.add("Pietra");
        listaAprovados.add("Pedro");
        listaAprovados.add("Alan");
        listaAprovados.add("Alice");

        for (String candidatos : listaAprovados){
            System.out.println(candidatos);
        }


//
    }
}
